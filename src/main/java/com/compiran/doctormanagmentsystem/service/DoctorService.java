package com.compiran.doctormanagmentsystem.service;

import com.compiran.doctormanagmentsystem.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();

    Doctor saveDoctor(Doctor doctor);

    Doctor doctorById(Long id);

    Doctor updateDoctor(Doctor doctor);

    void removeDoctorById(Long id);
}
