package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Doctor;
@Repository
public interface PatientRepo extends JpaRepository<Doctor, Integer>{
	
	@Query(value = "select * from doctor_details",nativeQuery = true)

	public List<Doctor> getDoctorinfo();
	
	@Query(value="select * from doctor_details order by doctor_id",nativeQuery=true)
	public List<Doctor> getSortedDocinfo();
	
	
}
