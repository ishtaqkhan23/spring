package com.smart.hospital.dao;

import com.smart.hospital.model.Patient;

import java.util.List;

public interface PatientDAO {
    List<Patient> getAllPatients();

    Patient getPatientById(Integer id);

    void addPatient(Patient patient);

    void updatePatient(Patient patient);

    void deletePatient(Integer id);
}
