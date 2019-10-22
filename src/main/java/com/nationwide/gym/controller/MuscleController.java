package com.nationwide.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.gym.entity.MuscleGroups;
import com.nationwide.gym.service.MuscleService;

@RestController
@RequestMapping("/muscle")
public class MuscleController {

	@Autowired
	private MuscleService muscleService;

	@GetMapping("muscles")
	public List<MuscleGroups> showAll() {
		return muscleService.showAll();
	}

	@PostMapping("muscles")
	public MuscleGroups saveData(@RequestBody MuscleGroups muscleGroup) {
		return muscleService.saveData(muscleGroup);
	}
}
