package com.compiran.doctormanagmentsystem.service.impl;

import com.compiran.doctormanagmentsystem.entity.Doctor;
import com.compiran.doctormanagmentsystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.compiran.doctormanagmentsystem.repository.DoctorRepository;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor doctorById(Long id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void removeDoctorById(Long id) {
        doctorRepository.deleteById(id);
    }
}
