package com.smart.hospital.daoimpl;

import com.smart.hospital.dao.PatientDAO;
import com.smart.hospital.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientDAOImpl implements PatientDAO {

    static List<Patient> patients = new ArrayList<>();

    static {
        patients.add(new Patient(1, "ish", "abc@xyz.com"));
        patients.add(new Patient(2, "nawaz","abcd@ww.com"));
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }

    @Override
    public Patient getPatientById(Integer id) {
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
        patients.add(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        Patient patientToBeUpdated = getPatientById(patient.getId());
        int indexOfPatientToBeUpdated = patients.indexOf(patientToBeUpdated);
        patients.add(indexOfPatientToBeUpdated, patient);
        patients.remove(indexOfPatientToBeUpdated + 1);
    }

    @Override
    public void deletePatient(Integer id) {
        Patient patienToBeDeleted = null;
        for(Patient patient: patients){
            if(patient.getId().equals(id)) {
                patienToBeDeleted = patient;
            }
        }
        patients.remove(patienToBeDeleted);
    }
}
