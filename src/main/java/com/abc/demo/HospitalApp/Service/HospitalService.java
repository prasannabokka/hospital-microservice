package com.abc.demo.HospitalApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;
import com.abc.demo.HospitalApp.Repository.HospitalRepository;
import com.abc.demo.HospitalApp.DTO.HospitalDTO;

@Service
public class HospitalService {
	@Autowired
	HospitalRepository hospitalRepo;
	public String createHospitals(List<HospitalEntity> hospitals) {
        hospitalRepo.saveAll(hospitals);
        return "Hospitals inserted successfully";
    }
	 public List<HospitalEntity> readAllHospitals()
	 {
		 return hospitalRepo.findAll();
	 }
	 
	 public HospitalEntity  readParticularHospital(int hospitalId)
	 {
		 return hospitalRepo.findById(hospitalId).get();
	 }
	 /*
	 public HospitalDTO  readParticularHospital(int hospitalId)
	 {
		HospitalEntity hospitalInfo = hospitalRepo.findById(hospitalId).get();
		HospitalDTO hospitalDto = new HospitalDTO();
		
		hospitalDto.setHospitalId(hospitalInfo.getHospitalId());
		hospitalDto.setHospitalName(hospitalInfo.getHospitalName());
		
		return hospitalDto;
	 }*/
	 public String deleteParticularHospital(int hospitalId)
	 {
		 hospitalRepo.deleteById(hospitalId);
		 return "deleted succefully";
	 }
}
