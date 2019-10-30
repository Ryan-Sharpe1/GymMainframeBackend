package com.nationwide.gym.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nationwide.gym.entity.MuscleGroups;

@Repository
public interface MuscleRepo extends JpaRepository<MuscleGroups, Integer> {

	@Modifying
	@Transactional
	@Query(value="update MuscleGroups m set m.musclegroups=?1 where m.muscleid=?2")
	public int editingrecord(String muscle,int id);
	
}


