package com.checkup.checkupmicroservice;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Doctor {


    private Integer doctorsId;
    private String doctorName;
    private String doctorContact;
    private String doctorSpeciality;
    private String doctorFees;
    private String environment;

    public Integer getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(Integer doctorsId) {
        this.doctorsId = doctorsId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorContact() {
        return doctorContact;
    }

    public void setDoctorContact(String doctorContact) {
        this.doctorContact = doctorContact;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getDoctorFees() {
        return doctorFees;
    }

    public void setDoctorFees(String doctorFees) {
        this.doctorFees = doctorFees;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}

