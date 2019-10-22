package com.nationwide.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.gym.entity.Exercises;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercises, Integer> {

}
