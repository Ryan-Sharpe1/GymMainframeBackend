package com.nationwide.gym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exercises {

	@Id
	@GeneratedValue
	private Integer exerciseid;
	private String exercise;
	private Integer muscleid;

	public Integer getExerciseid() {
		return exerciseid;
	}

	public void setExerciseid(Integer exerciseid) {
		this.exerciseid = exerciseid;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public Integer getMuscleid() {
		return muscleid;
	}

	public void setMuscleid(Integer muscleid) {
		this.muscleid = muscleid;
	}

}
