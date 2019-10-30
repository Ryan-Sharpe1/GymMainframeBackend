package com.nationwide.gym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQueries(value= {
//		@NamedQuery(
//					name="exercises.filterChest",
//					query="Select p from exercises p order by p.Chest"),
//		@NamedQuery(
//					name="exercises.filterShoulders",
//					query="Select p from exercises p order by p.Shoulders"),
//		@NamedQuery(
//					name="exercises.filterBicep",
//					query="Select p from exercises p order by p.Bicep"),
//		@NamedQuery(
//					name="exercises.filterTricep",
//					query="Select p from exercises p order by p.Tricep"),
//		@NamedQuery(
//					name="exercises.filterBack",
//					query="Select p from exercises p order by p.Back"),
//		@NamedQuery(
//					name="exercises.filterLegs",
//					query="Select p from exercises p order by p.Legs"),
//		@NamedQuery(
//					name="exercises.filterCore",
//					query="Select p from exercises p order by p.Core"),
//		@NamedQuery(
//					name="exercises.filterCardio",
//					query="Select p from exercises p order by p.Cardio"),	
//})

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
