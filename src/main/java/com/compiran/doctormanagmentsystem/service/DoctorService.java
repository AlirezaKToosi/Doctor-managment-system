package com.compiran.doctormanagmentsystem.service;

import com.compiran.doctormanagmentsystem.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor saveDoctor(Doctor doctor);
}
