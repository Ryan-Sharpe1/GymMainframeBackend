package com.nationwide.gym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value= {
		@NamedQuery(
					name="Exercises.filtermusclegroup",
					query="Select p from Exercises p where p.musclegroup=?1"),
		})

public class Exercises {

	@Id
	@GeneratedValue
	private Integer exerciseid;
	private String exercise;
	private String musclegroup;
	private Integer sets;
	private Integer reps;
	private String weight;
	private String weekday;
	
	
	
	
	public Integer getSets() {
		return sets;
	}

	public void setSets(Integer sets) {
		this.sets = sets;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

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

	public String getMusclegroup() {
		return musclegroup;
	}

	public void setMusclegroup(String musclegroup) {
		this.musclegroup = musclegroup;
	}
	

}
