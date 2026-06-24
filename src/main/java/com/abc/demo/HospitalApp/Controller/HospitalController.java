package com.abc.demo.HospitalApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.demo.HospitalApp.Entity.HospitalEntity;
import com.abc.demo.HospitalApp.Service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	HospitalService hospitalService;

    @PostMapping("/create")
    public String recieveData(@RequestBody List<HospitalEntity> hospitals)
    {
        return hospitalService.createHospitals(hospitals);
    }

    @GetMapping("/readAll")
    public List<HospitalEntity> readDetails()
    {
        return hospitalService.readAllHospitals();
    }
    @GetMapping("/read/{hospitalId}")
    public HospitalEntity getHospital(@PathVariable int hospitalId)
    {
        return hospitalService.readParticularHospital(hospitalId);
    }

    @DeleteMapping("/delete/{hospitalId}")
    public String deleteHospital(@PathVariable int hospitalId)
    {
        return hospitalService.deleteParticularHospital(hospitalId);
    }
}

