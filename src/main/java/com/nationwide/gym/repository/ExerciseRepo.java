package com.nationwide.gym.repository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nationwide.gym.entity.Exercises;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercises, Integer> {

	public ArrayList<Exercises> filtermusclegroup(String musclegroup);
	
	@Modifying
	@Transactional
	@Query(value="update Exercises m set m.exercise=?1 where m.exerciseid=?2")
	public int editingrecord1(String exercise,int id);


	@Modifying
	@Transactional
	@Query(value="update Exercises m set m.musclegroup=?1 where m.exerciseid=?2")
	public int editingrecord2(String musclegroup,int id);
	
//	@Modifying
//	@Transactional
//	@Query(value="update Exercises m set m.sets=?1 where m.exerciseid=?2")
//	public int editingrecord3(int sets,int id);
//	
//	@Modifying
//	@Transactional
//	@Query(value="update Exercises m set m.reps=?1 where m.exerciseid=?2")
//	public int editingrecord4(int reps,int id);
//	
//	@Modifying
//	@Transactional
//	@Query(value="update Exercises m set m.weight=?1 where m.exerciseid=?2")
//	public int editingrecord5(String weight,int id);
//	
	
	public List<Exercises> findByMusclegroup(String egroup);
}
