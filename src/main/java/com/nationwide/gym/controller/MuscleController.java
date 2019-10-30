package com.nationwide.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.gym.entity.MuscleGroups;
import com.nationwide.gym.service.MuscleService;

@RestController
public class MuscleController {

	@Autowired
	private MuscleService muscleService;

	@GetMapping("/muscles")
	public List<MuscleGroups> showAll() {
		return muscleService.showAll();
	}
	
	@PutMapping("/musclesedit/{id}/{muscle}")
	public List<MuscleGroups> editData1(@PathVariable Integer id, @PathVariable String muscle) {
	
		 muscleService.editingrecord(muscle,id);
		return muscleService.showAll();
	}
	
	@PostMapping("/muscles")
	public MuscleGroups saveData(@RequestBody MuscleGroups muscleGroup) {
		return muscleService.saveData(muscleGroup);
	}
	@DeleteMapping("/muscles/{id}")
	public String deleteData(@PathVariable Integer id) {
		muscleService.deleteData(id);
		return "Succesfully Deleted";
	}
}
