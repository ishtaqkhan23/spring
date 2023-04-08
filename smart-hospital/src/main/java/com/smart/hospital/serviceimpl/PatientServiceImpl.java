package com.smart.hospital.serviceimpl;

import com.smart.hospital.dao.PatientDAO;
import com.smart.hospital.daoimpl.PatientDAOImpl;
import com.smart.hospital.model.Patient;
import com.smart.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDAO patientDAO;

    public void setPatientDAO(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    public List<Patient> getAllPatients() {// business logic
        return patientDAO.getAllPatients();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientDAO.getPatientById(id);
    }

    @Override
    public void addPatient(Patient patient) {
        patientDAO.addPatient(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDAO.updatePatient(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientDAO.deletePatient(id);
    }
}
