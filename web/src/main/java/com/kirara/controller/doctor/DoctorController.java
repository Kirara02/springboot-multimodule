package com.kirara.controller.doctor;

import com.kirara.model.doctor.Doctor;
import com.kirara.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        return doctorService.getDoctors();
    }
}
