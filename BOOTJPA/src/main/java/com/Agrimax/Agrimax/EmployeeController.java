package com.Agrimax.Agrimax;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private CostServices serve;
	
	@Autowired
	private LocationServices ser;
	
	@GetMapping("/Employee")
	public List<Employee> list()
	{
		return service.listAll();
	}

	@GetMapping("/Employee/{id}")
		public ResponseEntity<Employee> get(@PathVariable Integer id)
		{
			try
			{
				Employee Emp=service.get(id);
				return new ResponseEntity<Employee>(Emp,HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
			}
		}

	
	@PostMapping("/Employee")
	public void add(@RequestBody Employee student)
	{
		System.out.println("saved");
		service.save(student);
	}
	
	@PutMapping("/Employee/{id}")
	public ResponseEntity<?> update(@RequestBody Employee emp, @PathVariable Integer id)
	{
		try
		{
			Employee existProduct=service.get(id);
			service.save(emp);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/Employee/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
		
  @PostMapping("/Employee/check")
  public boolean validateUser(@RequestBody Map<String, Object> requestPayload) {
      String email = (String) requestPayload.get("email");
      String password = (String) requestPayload.get("password");
      
      System.out.println("Authenticating the user! email: " + email + "  Name: " + password);
      
      boolean auth = service.auth(email, password);
      
      return auth;
  }
  
  
  @PostMapping("/ContactUs")
	public void add(@RequestBody contactUs contact)
	{
		email.emailSend(contact);
		System.out.println("saved");
	}
	
  @PostMapping("/MlModel")
  public String[] Ml(@RequestBody InputModel mod)
	  {
	  
	  	Model md=new Model();
	  	
	  	String crop1 = mod.Crop1;
	  	String crop2 = mod.Crop2;
	  	String crop3 = mod.Crop3;
	  	int Area1 = Integer.parseInt(mod.Area1);
	  	int Area2 = Integer.parseInt(mod.Area2);
	  	int Area3 = Integer.parseInt(mod.Area3);
	  	String location=mod.Location;
	  	
	  	Cost Emp=serve.get(crop1);
		
		String crop = Emp.crop;
		int fertilizers = Emp.fertilizers*Area1;
		int perni = Emp.perni*Area1;
		int kapni = Emp.kapni*Area1;
		int investment = Emp.investment*Area1;	
	  	
		Location Em=ser.get(mod.Location);
		
		int temperature=Em.temperature;
		
		int land=11111;
		if(Em.land.equals("Good"))
		{
			land=2;
		}else if(Em.land.equals("Average"))
		{
			land=1;
		}
		else if(Em.land.equals("Average"))
		{
			land=0;
		}
		
		int region=111111;
		if(Em.region.equals("Plane"))
		{
			region=1;
		}
		else if(Em.region.equals("Hill")) {
			region=0;
		}
		
		int rain=111111;
		if(Em.rain.equals("Good"))
		{
			rain=2;
		}
		else if(Em.rain.equals("Average"))
		{
			rain=1;
		}else if(Em.rain.equals("Bad"))
		{
			rain=0;
		}
		
//		System.out.println(" \nCrop: "+crop+"\nFertilizer:"+fertilizers+"\nperni:"+perni+"\nkapni:"+kapni+"\ninvestment:"+investment+"\ntemperature:"+temperature+"\nland:"+land+"\nregion:"+region+"\nrain:"+rain);
		
		
		double val1=md.MLModel(crop,fertilizers,perni,kapni,investment,temperature,land,region,rain,Area1);
		
		int total1=fertilizers+perni+kapni+investment;
		
		
		Emp=serve.get(crop2);
		crop = Emp.crop;
		fertilizers = Emp.fertilizers*Area2;
		perni = Emp.perni*Area2;
		kapni = Emp.kapni*Area2;
		investment = Emp.investment*Area2;
		
//		System.out.println(" \nCrop: "+crop+"\nFertilizer:"+fertilizers+"\nperni:"+perni+"\nkapni:"+kapni+"\ninvestment:"+investment+"\ntemperature:"+temperature+"\nland:"+land+"\nregion:"+region+"\nrain:"+rain);

		double val2=md.MLModel(crop,fertilizers,perni,kapni,investment,temperature,land,region,rain,Area2);
		
		int total2=fertilizers+perni+kapni+investment;
		
		Emp=serve.get(crop3);
		crop = Emp.crop;
		fertilizers = Emp.fertilizers*Area3;
		perni = Emp.perni*Area3;
		kapni = Emp.kapni*Area3;
		investment = Emp.investment*Area3;
		
//		System.out.println(" \nCrop: "+crop+"\nFertilizer:"+fertilizers+"\nperni:"+perni+"\nkapni:"+kapni+"\ninvestment:"+investment+"\ntemperature:"+temperature+"\nland:"+land+"\nregion:"+region+"\nrain:"+rain);

		double val3=md.MLModel(crop,fertilizers,perni,kapni,investment,temperature,land,region,rain,Area3);
		
		int total3=fertilizers+perni+kapni+investment;
		
		System.out.println("\nThis Is Final Proft:"+(val1+val2+val3)+"\n");
		
		 String[] resultArray = {Double.toString(val1), Double.toString(val2), Double.toString(val3), Double.toString(val1+val2+val3),crop1,crop2,crop3,Integer.toString(total1),Integer.toString(total2),Integer.toString(total3),Integer.toString(total1+total2+total3)};
		 
		return resultArray;

	  }
	
}
