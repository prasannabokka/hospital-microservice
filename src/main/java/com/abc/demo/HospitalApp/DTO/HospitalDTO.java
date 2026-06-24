package com.abc.demo.HospitalApp.DTO;

public class HospitalDTO {
	private int hospitalId;
	private String hsopitalName;
	
	
	public HospitalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HospitalDTO(int hospitalId, String hsopitalName) {
		super();
		this.hospitalId = hospitalId;
		this.hsopitalName = hsopitalName;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHsopitalName() {
		return hsopitalName;
	}
	public void setHsopitalName(String hsopitalName) {
		this.hsopitalName = hsopitalName;
	}
	
	
}
