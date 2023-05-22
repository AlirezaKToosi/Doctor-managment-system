package com.compiran.doctormanagmentsystem.controller;

import com.compiran.doctormanagmentsystem.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.compiran.doctormanagmentsystem.service.DoctorService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/doctors/edit/{id}")
    public String editDoctorForm(@PathVariable Long id, Model model) {
        model.addAttribute("doctor", doctorService.doctorById(id));
        return "edit-doctor";
    }

    @PostMapping("/doctors/{id}")
    public String updateDoctor(@PathVariable Long id,
                               @ModelAttribute("doctor") Doctor doctor,
                               Model model) {
        //get doctor info from database
        Doctor doctor1 = doctorService.doctorById(id);
        doctor1.setId(id);
        doctor1.setFirstName(doctor.getFirstName());
        doctor1.setLastName(doctor.getLastName());
        doctor1.setEmail(doctor.getEmail());

        //save new update data
        doctorService.updateDoctor(doctor1);

        return "redirect:/doctors";

    }
}
