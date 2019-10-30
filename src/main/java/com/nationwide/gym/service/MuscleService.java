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
	public MuscleGroups editData(MuscleGroups muscleGroup) {
		return repo.save(muscleGroup);
	}

	public MuscleGroups saveData(MuscleGroups muscleGroup) {
		return repo.save(muscleGroup);
	}
	public void deleteData(Integer id) {
		repo.deleteById(id);
	}
	public int editingrecord(String muscle, Integer id) {
			
		return repo.editingrecord(muscle, id);
	}
}
