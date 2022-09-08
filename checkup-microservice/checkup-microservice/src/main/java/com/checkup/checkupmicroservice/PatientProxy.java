package com.checkup.checkupmicroservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="patients-service" , url = "localhost:8090")
public interface PatientProxy {

    @GetMapping("/findAll")
    public List<Patient> fetchAll();
}
