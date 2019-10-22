package com.nationwide.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.gym.entity.MuscleGroups;
import com.nationwide.gym.repository.MuscleRepo;

@Service
public class MuscleService {

	@Autowired
	private MuscleRepo repo;

	public List<MuscleGroups> showAll() {
		return repo.findAll();
	}

	public MuscleGroups saveData(MuscleGroups muscleGroup) {
		return repo.save(muscleGroup);
	}
}
