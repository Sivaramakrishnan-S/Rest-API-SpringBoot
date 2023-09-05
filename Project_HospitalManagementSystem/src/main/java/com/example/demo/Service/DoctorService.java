package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Doctor;


import com.example.demo.Repository.DoctorRepo;



@Service

public class DoctorService {

	

	@Autowired

	DoctorRepo res;


public List<Doctor> showdinfo()

{

	return res.findAll();

}


public Doctor saveinfo(Doctor p)

{

	return res.save(p);

}


public Doctor changedinfo(Doctor p)

{

	return res.saveAndFlush(p);

}


public void deletedid(int did)

	{

		res.deleteById(did);

	}

}