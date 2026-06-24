package com.abc.demo.HospitalApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "hospitals")
public class HospitalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalId;
	@NotBlank
	@Size( min = 3, max = 50, message = "please enter min 3 "
			+ "characters and maximum 50 characters")
	private String hospitalName;
	@NotBlank
	@Size( min = 3, max = 50, message = "please enter min 3 "
			+ "characters and maximum 50 characters")
	private String hospitalLocation;
	
	
	 public HospitalEntity() {
	    }
	 
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalLocation() {
		return hospitalLocation;
	}
	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}
	
	
}
