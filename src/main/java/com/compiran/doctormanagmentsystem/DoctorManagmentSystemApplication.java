package com.compiran.doctormanagmentsystem;

import com.compiran.doctormanagmentsystem.entity.Doctor;
import com.compiran.doctormanagmentsystem.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoctorManagmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DoctorManagmentSystemApplication.class, args);
    }

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public void run(String... args) throws Exception {
        /*Doctor doctor = new Doctor("Bahareh", "Parkam", "Dr.b.parkam@gmail.com");
        Doctor doctor2 = new Doctor("Alireza", "Kafshdartoosi", "a.k.toosi@gmail.com");
        Doctor doctor3 = new Doctor("Hana", "Kafshdartoosi", "H.k.toosi@gmail.com");
        doctorRepository.save(doctor);
        doctorRepository.save(doctor2);
        doctorRepository.save(doctor3);*/
    }
}
