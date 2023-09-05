package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Model.Doctor;



public interface DoctorRepo extends JpaRepository<Doctor, Integer>{



}