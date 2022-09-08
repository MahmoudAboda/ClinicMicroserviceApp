package com.microservices.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private Configuration configuration;

    @Autowired
    private PatientRepository patientRepository;


    @GetMapping("/findAll")
    public List<Patient> fetchAll(){
        return this.patientRepository.findAll();
    }

    @PostMapping("/addPatient")
    public ResponseEntity<?> addTodo(@RequestBody Patient patient){
        return new ResponseEntity<>(this.patientRepository.save(patient), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        if(this.patientRepository.findById(id).isPresent()){
            this.patientRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id,@RequestBody Patient patient){
        if (this.patientRepository.findById(id).isPresent()){
            patient.setPatientId(id);
            return new ResponseEntity<>(this.patientRepository.save(patient),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        if (this.patientRepository.findById(id).isPresent()){

            return new ResponseEntity<>(this.patientRepository.findById(id),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
