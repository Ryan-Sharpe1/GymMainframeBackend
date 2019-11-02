package com.nationwide.gym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.gym.entity.Exercises;
import com.nationwide.gym.service.ExerciseService;

@RestController
@CrossOrigin("*")
public class ExerciseController {

	
	@Autowired
	private ExerciseService exerciseService;

	@GetMapping("/exercise")
	public List<Exercises> showAll() {
		return exerciseService.showAll();
	}
	@PutMapping("/exerciseedit1/{id}/{exercise}")
	public List<Exercises> editData1(@PathVariable Integer id, @PathVariable String exercise) {
	
		 exerciseService.editingrecord1(exercise,id);
		return exerciseService.showAll();
	}
	
	@PutMapping("/exerciseedit2/{id}/{musclegroup}")
	public List<Exercises> editData2(@PathVariable Integer id, @PathVariable String musclegroup) {
	
		 exerciseService.editingrecord2(musclegroup,id);
		return exerciseService.showAll();
	}
	@PutMapping("/exerciseedit3/{id}/{sets}")
	public List<Exercises> editData3(@PathVariable Integer id, @PathVariable Integer sets) {
	
		 exerciseService.editingrecord3(sets,id);
		return exerciseService.showAll();
	}
	@PutMapping("/exerciseedit4/{id}/{reps}")
	public List<Exercises> editData4(@PathVariable Integer id, @PathVariable Integer reps) {
	
		 exerciseService.editingrecord4(reps,id);
		return exerciseService.showAll();
	}
	@PutMapping("/exerciseedit5/{id}/{weight}")
	public List<Exercises> editData5(@PathVariable Integer id, @PathVariable String weight) {
	
		 exerciseService.editingrecord5(weight,id);
		return exerciseService.showAll();
	}


	@PostMapping("/exercise")
	public Exercises saveData(@RequestBody Exercises exercise) {
		return exerciseService.saveData(exercise);
	}
	
	@DeleteMapping("/exercise/{id}")
	public String deleteData(@PathVariable Integer id) {
		exerciseService.deleteData(id);
		return "Succesfully Deleted";
	}
	
	@CrossOrigin
	@GetMapping("/exercise/filtermusclegroup/{musclegroup}")
	public ArrayList<Exercises> filtermusclegroup(@PathVariable String musclegroup) {
		return exerciseService.filtermusclegroup(musclegroup);
	}
	
	@CrossOrigin
	@GetMapping("/exercise1/filtermusclegroup/{musclegroup}")
	public ArrayList<Exercises> filtermusclegroup1(@PathVariable String musclegroup) {
		return exerciseService.filtermusclegroup(musclegroup);
	}
	
	

}
