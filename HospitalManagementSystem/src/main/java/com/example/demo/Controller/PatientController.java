package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Patient;
import com.example.demo.Service.PatientService;

@RestController
public class PatientController {
	@Autowired
	
	PatientService sser;
	@PostMapping("addPatient")
	public Patient add(@RequestBody Patient ss)
	{
		return sser.saveinfo(ss);
		
	}
	@GetMapping("PatientList")
	public List<Patient> show()
	{
		return sser.showinfo();
	}
	@PutMapping("update")
	public Patient modify(@RequestBody Patient ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("delete")
	public String del(@RequestBody Patient ss) {
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
	 @GetMapping("ShowByID/{id}")
	    public  Optional<Patient>  getmyid(@PathVariable int id)
	    {
	    return sser.getid(id);
	    }
	   
	    @DeleteMapping("delid/{id}")
	    public  void deletemyid(@PathVariable int id)
	    {
	    sser.deleteid(id);
	    }
	   
	    @PutMapping("UpdateById/{id}")
	    public String modifybyId(@PathVariable int id,@RequestBody Patient ss)
	    {
	    return sser.updateInfobyId(id,ss);
	    }
}
