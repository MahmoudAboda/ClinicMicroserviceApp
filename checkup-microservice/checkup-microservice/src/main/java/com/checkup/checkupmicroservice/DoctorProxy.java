package com.checkup.checkupmicroservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

@FeignClient(name="doctors-service",url="localhost:8001")
//@FeignClient(name="patients-service")
public interface DoctorProxy {

    @GetMapping("/findAll")
    public List<Doctor> fetchAll();

}
