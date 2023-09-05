package com.example.demo.Controller;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Doctor;


import com.example.demo.Service.DoctorService;



@RestController
@CrossOrigin
public class Dcontroller {

	

	@Autowired

	DoctorService aser;


@PostMapping("adddoctor")

public Doctor add(@RequestBody Doctor d)

{

	return aser.saveinfo(d);

}


@GetMapping("showddetails")

public List<Doctor> showd()

{

	return aser.showdinfo();

}

	
	@PutMapping("updated")

	public Doctor update(@RequestBody Doctor d)

	{

		return aser.changedinfo(d);

	}


@DeleteMapping("deldid/{id}")

public  void deletebydid(@PathVariable int id)

{

	aser.deletedid(id);

}

}