package com.smart.hospital.daoimpl;

import com.smart.hospital.dao.PatientDAO;
import com.smart.hospital.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PatientDAOImpl implements PatientDAO {

    List<Patient> patients;

    @Override
    public List<Patient> getAllPatients() {
        Patient p = new Patient();
        p.setName("ishtaq");
        p.setEmail("abc@xyz.com");
        patients = Arrays.asList(p);
        return patients;
    }

    @Override
    public Patient getPatientById(Long id) {
        Patient patient = null;
        for(Patient patientObj: patients){
            if(patientObj.getId().equals(id)) {
                patient = patientObj;
            }
        }
        return patient;
    }

    @Override
    public void addPatient(Patient patient) {
        if(patients == null) {
            patients = new ArrayList<>();
        }
        patients.add(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        int indexOfPatientToBeUpdated = patients.indexOf(patient);
        patients.add(indexOfPatientToBeUpdated, patient);
    }

    @Override
    public void deletePatient(Long id) {
        Patient patienToBeDeleted = null;
        for(Patient patient: patients){
            if(patient.getId().equals(id)) {
                patienToBeDeleted = patient;
            }
        }
        patients.remove(patienToBeDeleted);
    }
}
