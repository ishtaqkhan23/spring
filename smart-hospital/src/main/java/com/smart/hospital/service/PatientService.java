package com.smart.hospital.service;

import com.smart.hospital.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();

    Patient getPatientById(Long id);

    void addPatient(Patient patient);

    void updatePatient(Patient patient);

    void deletePatient(Long id);
}
