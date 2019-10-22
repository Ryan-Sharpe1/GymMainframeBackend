package com.nationwide.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.gym.entity.MuscleGroups;

@Repository
public interface MuscleRepo extends JpaRepository<MuscleGroups, Integer> {
}
