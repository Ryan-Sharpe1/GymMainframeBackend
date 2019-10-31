package com.nationwide.gym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.gym.entity.Exercises;
import com.nationwide.gym.repository.ExerciseRepo;

@Service
public class ExerciseService {

	@Autowired
	private ExerciseRepo repo;
	

	public List<Exercises> showAll() {
		return repo.findAll();
	}

	public Exercises saveData(Exercises exercise) {
		return repo.save(exercise);
	}

	public void deleteData(Integer id) {
		repo.deleteById(id);
	}
	public int editingrecord1(String exercise, Integer id) {
		
		return repo.editingrecord1(exercise, id);
	}
	public int editingrecord2(String musclegroup, Integer id) {
		
		return repo.editingrecord2(musclegroup, id);
	}
	public ArrayList<Exercises> filterChest(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterBicep(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterTricep(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterShoulders(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterBack(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterCore(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterCardio(){
		return repo.filterChest();
	}
	public ArrayList<Exercises> filterLegs(){
		return repo.filterChest();
	}
}
