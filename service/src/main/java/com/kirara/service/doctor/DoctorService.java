package com.kirara.service.doctor;

import com.kirara.dao.doctor.DoctorRepository;
import com.kirara.mailservice.EmailService;
import com.kirara.model.doctor.Doctor;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private EmailService emailService;
    @PostConstruct
    public void iniDoctor(){
        doctorRepository.saveAll(Stream.of(
                new Doctor(101,"John","Cardiac"),
                new Doctor(105,"Samuel","eye")
        ).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        emailService.sendEmail();
        return doctorRepository.findAll();
    }
}
