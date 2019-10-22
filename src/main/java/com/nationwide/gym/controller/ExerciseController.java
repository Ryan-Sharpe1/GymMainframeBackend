package com.nationwide.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.gym.entity.Exercises;
import com.nationwide.gym.service.ExerciseService;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

	
	@Autowired
	private ExerciseService exerciseService;

	@GetMapping("exercises")
	public List<Exercises> showAll() {
		return exerciseService.showAll();
	}

	@PostMapping("exercises")
	public Exercises saveData(@RequestBody Exercises exercise) {
		return exerciseService.saveData(exercise);
	}
	
	@DeleteMapping("exercises/{id}")
	public String deleteData(@PathVariable Integer id) {
		exerciseService.deleteData(id);
		return "Succesfully Deleted";
	}

}
