package com.nationwide.gym.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MuscleGroups {

	@Id
	@GeneratedValue
	private Integer muscleid;
	private String musclegroups;

	public Integer getMuscleid() {
		return muscleid;
	}

	public void setMuscleid(Integer muscleid) {
		this.muscleid = muscleid;
	}

	public String getMusclegroups() {
		return musclegroups;
	}

	public void setMusclegroups(String musclegroups) {
		this.musclegroups = musclegroups;
	}

}
