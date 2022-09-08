package com.doctors.doctors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors,Integer> {
//   public Doctors findByNameAndContact(String name,String Contact);
}
