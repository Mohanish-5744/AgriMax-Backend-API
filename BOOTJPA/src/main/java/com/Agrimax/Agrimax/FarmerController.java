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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FarmerController {
	
	@Autowired
	private FarmerService service;
	
	@GetMapping("/Farmer")
	public List<Farmer> list()
	{
		return service.listAll();
	}

	@GetMapping("/Farmer/{name}")
		public ResponseEntity<Farmer> get(@PathVariable String name)
		{
			try
			{
				Farmer fam=service.getSearch(name);
				
				if(fam==null)
				{
					return new ResponseEntity<Farmer>(HttpStatus.NOT_FOUND);
				}
				return new ResponseEntity<Farmer>(fam,HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Farmer>(HttpStatus.NOT_FOUND);
			}
		}

	
	@PostMapping("/Farmer")
	public void add(@RequestBody Farmer farmer)
	{
		System.out.println("saved");
		service.save(farmer);
		
	}
	
	
	@PutMapping("/Farmer/{id}")
	public ResponseEntity<?> update(@RequestBody Farmer fam, @PathVariable Integer id)
	{
		try
		{
			Farmer existProduct=service.get(id);
			service.save(fam);
			return new ResponseEntity<>("Information updated successfully",HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/Farmer/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
		
	
	
	@GetMapping("/FarmerInfo")
	public List<Farmer> searchBarFarmerInfo(@RequestParam("fname") String fname) {


	  return service.SearchFname(fname);

	
	}
	
}
