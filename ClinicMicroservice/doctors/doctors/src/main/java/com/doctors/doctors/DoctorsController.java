package com.doctors.doctors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorsController {

    @Autowired
    DoctorsRepository doctorsRepository;
    @Autowired
    private Environment environment;
//    @GetMapping("/doctors/from/{from}/to/{to}")
//    public Doctors retrieveDoctors(
//            @PathVariable String from,
//            @PathVariable String to
//    ){
//       // Doctors doctors=new Doctors("100",from,to,"665","655665");
//        Doctors doctors=doctorsRepository.findByNameAndContact(from,to);
//        if(doctors==null){
//            throw new RuntimeException("can not find data");
//        }
//        String port=environment.getProperty("local.server.port");
//        doctors.setEnvironment(port);
//    return doctors;
//    }


    @GetMapping("/findAll")
    public List<Doctors> fetchAll(){
        return this.doctorsRepository.findAll();
    }

    @PostMapping("/addDoctor")
    public ResponseEntity<?> addTodo(@RequestBody Doctors doctors){
        return new ResponseEntity<>(this.doctorsRepository.save(doctors), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        if(this.doctorsRepository.findById(id).isPresent()){
            this.doctorsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id,@RequestBody Doctors doctors){
        if (this.doctorsRepository.findById(id).isPresent()){
            doctors.setDoctorsId(id);
            return new ResponseEntity<>(this.doctorsRepository.save(doctors),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        if (this.doctorsRepository.findById(id).isPresent()){

            return new ResponseEntity<>(this.doctorsRepository.findById(id),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
