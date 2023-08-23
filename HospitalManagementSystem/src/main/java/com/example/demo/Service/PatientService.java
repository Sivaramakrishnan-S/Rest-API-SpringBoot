package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PatientRepo;
import com.example.demo.Model.Patient;

@Service
public class PatientService {

	@Autowired
	PatientRepo sr;
	public Patient saveinfo(Patient ss)
	{
		return sr.save(ss);
	}
	public List<Patient> showinfo(){
		return sr.findAll();
	}
	public Patient changeinfo(Patient ss) {
		return sr.saveAndFlush(ss);
	}
	
	public void deleteinfo(Patient ss)
	  {
	  sr.delete(ss);
	  }
	 
	  public Optional<Patient> getid(int id)
	  {
	  return sr.findById(id);
	  }
	 
	  public void deleteid(int id)
	  {
	  sr.deleteById(id);
	  }
	 
	  public String updateInfobyId(int id,Patient ss)
	  {
	  sr.saveAndFlush(ss);
	  if(sr.existsById(id))
	  {
	  return "Updated";
	  }
	  else
	  {
	  return "Enter Valid PatientId";
	  }
	  }
}

