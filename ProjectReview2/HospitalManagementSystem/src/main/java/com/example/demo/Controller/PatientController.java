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

import com.example.demo.Model.Doctor;

import com.example.demo.Service.PatientService;


@RestController
public class PatientController {
	@Autowired
	
	PatientService sser;
	@PostMapping("addPatient")
	public Doctor add(@RequestBody Doctor ss)
	{
		return sser.saveinfo(ss);
		
	}
	@GetMapping("PatientList")
	public List<Doctor> show()
	{
		return sser.showinfo();
	}
	@PutMapping("update")
	public Doctor modify(@RequestBody Doctor ss) {
		return sser.changeinfo(ss);
	}
	@DeleteMapping("delete")
	public String del(@RequestBody Doctor ss) {
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
	 @GetMapping("ShowByID/{id}")
	    public  Optional<Doctor>  getmyid(@PathVariable int id)
	    {
	    return sser.getid(id);
	    }
	   
	    @DeleteMapping("delid/{id}")
	    public  void deletemyid(@PathVariable int id)
	    {
	    sser.deleteid(id);
	    }
	   
	    @PutMapping("UpdateById/{id}")
	    public String modifybyId(@PathVariable int id,@RequestBody Doctor ss)
	    {
	    return sser.updateInfobyId(id,ss);
	    }
	    @PostMapping("savePatientdetails")
		public Doctor addPatients(@RequestBody Doctor ss)
		{
			return sser.savePatientdetails(ss);
		}
	    @GetMapping("showpatientdetails")
		public List<Doctor> showpatientdetails() {
			return  sser.showpatientinfo();
		}
	    @GetMapping("sort/{name}")

		public List<Doctor> getsortinfo(@PathVariable String name)

		{

			return sser.sortinfo(name);

		}

		@GetMapping("paging/{pageno}/{pagesize}")

		public List<Doctor> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)

		{

			return sser.getbypage(pageno,pagesize);

		}
		@GetMapping("showDoc")
		public List<Doctor> getDoctorinfo(){
			return sser.getDoctor();
			
		}
		@GetMapping("showSortDoc")
		public List<Doctor> getSortedDocinfo(){
			return sser.getSortDoctor();
			
		}
		
		
}
