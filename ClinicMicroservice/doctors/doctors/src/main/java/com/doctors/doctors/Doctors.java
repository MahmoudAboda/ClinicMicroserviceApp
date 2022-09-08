package com.doctors.doctors;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctorsId")
    private Integer doctorsId;
    @Column(name="doctorName")
    private String doctorName;
    @Column(name="doctorContact")
    private String doctorContact;
    @Column(name="doctorSpeciality")
    private String doctorSpeciality;
    @Column(name="doctorFees")
    private String doctorFees;
    @Column(name="environment")
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
