package com.kirara.dao.doctor;

import com.kirara.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
