package com.compiran.doctormanagmentsystem.controller;

import com.compiran.doctormanagmentsystem.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.compiran.doctormanagmentsystem.service.DoctorService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DoctorController {


    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/doctors")
    public String listDoctors(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "doctors";
    }

    @GetMapping("/doctors/new")
    public String addDoctor(Model model) {
        //Create doctor object for keeping doctor from form
        Doctor doctor = new Doctor();
        model.addAttribute("doctor", doctor);
        return "Add_doctor";
    }

    @PostMapping("/doctors")
    public String saveDoctor(@ModelAttribute("doctors") Doctor doctor) {
        doctorService.saveDoctor(doctor);
        return "redirect:/doctors";
    }
}
