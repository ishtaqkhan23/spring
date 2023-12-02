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


    
    //@RequestMapping(method = RequestMethod.GET, path = "/list")
    @GetMapping("/list")
    public String list(Model model) {

        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);

        model.addAttribute("notificationMsg", notification.getMessage());

        model.addAttribute("url", dbConfig.getUrl());
        return "patient-list";
    }
    //prefix - /WEB-INF/views/
    //sufix - .jsp
    // /WEB-INF/view/patient-list.jsp


    /*@GetMapping("/add-patient")
    public String addPatient(){
        return "add-patient";
    }*/

    @PostMapping("/add")
    public String add(@ModelAttribute("patient") Patient patient, Model model) {
        patientService.addPatient(patient);

        model.addAttribute("notificationMsg", "Successfully Added");
        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);
        return "patient-list";
    }

    @GetMapping("/edit/{id}")
    public String editPatient(@PathVariable("id") Integer id, Model model){
        Patient patient = patientService.getPatientById(id);
        model.addAttribute("patient", patient);
        return "edit-patient-details";
    }


    @PutMapping("/update")
    public String update(@ModelAttribute("patient") Patient patient, Model model) {
        patientService.updatePatient(patient);

        model.addAttribute("notificationMsg", "Successfully Updated");
        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);
        return "patient-list";
    }

    @GetMapping("/delete/{id}") //delete
    public String deletePathParam(@PathVariable("id") Integer id, Model model) {
        patientService.deletePatient(id);

        model.addAttribute("notificationMsg", "Successfully Deleted");
        List<Patient> patientList = patientService.getAllPatients();
        model.addAttribute("patientList", patientList);
        return "patient-list";
    }

    public String deleteQueryParam(@RequestParam("id") Long id) {
        // implementation
        return null;
    }
}
