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
	private String weekday;
	
	
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
