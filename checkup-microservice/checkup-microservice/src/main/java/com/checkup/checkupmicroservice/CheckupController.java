package com.checkup.checkupmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class CheckupController {


    @Autowired
    private DoctorProxy doctorProxy;

    @Autowired
    private PatientProxy patientProxy;

//
//    @Autowired
//    private DoctorProxy doctorProxy;
//    @GetMapping("/checkup/from/{from}/to/{to}/quantity/{quantity}")
//    public Checkup CalculatorCheckup(
//            @PathVariable String from,
//            @PathVariable String to,
//            @PathVariable Date date
//    ){
//        Checkup checkup=doctorProxy.retrieveDoctors(from,to);
//        return new Checkup(checkup.getPriority(),to,date,"800");

//    }



    @GetMapping("/checkup-doctor/findAll")
    public List<Doctor> fetchAll(){
        List<Doctor> doctors=doctorProxy.fetchAll();
        return doctors;
    }


    @GetMapping("/checkup-patient/findAll")
    public List<Patient> fetchAllPatient(){
        List<Patient> patients=patientProxy.fetchAll();
        return patients;
    }

}
