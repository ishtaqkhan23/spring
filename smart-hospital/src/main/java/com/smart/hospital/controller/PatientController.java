package com.smart.hospital.controller;

import com.smart.hospital.model.DBConfig;
import com.smart.hospital.model.Notification;
import com.smart.hospital.model.Patient;
import com.smart.hospital.service.PatientService;
import com.smart.hospital.serviceimpl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private Notification notification;

    @Autowired
    private DBConfig dbConfig;
    
    @GetMapping("/list")
    public String list(Model model) {
        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);

        model.addAttribute("notificationMsg", notification.getMessage());

        model.addAttribute("url", dbConfig.getUrl());
        return "patient-list";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("patient") Patient patient, Model model) {
        patientService.addPatient(patient);
        model.addAttribute("message", "Successfully Added");
        return "add-patient";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("patient") Patient patient) {
        // implementation
        return null;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        // implementation
        return null;
    }
}
