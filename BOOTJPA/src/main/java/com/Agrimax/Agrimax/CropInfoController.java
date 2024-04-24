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
public class CropInfoController {

@Autowired
private CropInfoService serv;


		@GetMapping("/CropInfo")
		public List<CropInfo> searchBarCropInfo(@RequestParam("name") String name) {
//			System.out.println("Welcome to controller.  Search Query: "+ name);
		  return serv.SearchName(name);
		}
		
		
		@GetMapping("/cropDetail/{name}")
		public ResponseEntity<CropInfo> get(@PathVariable String name)
		{
			try {
				CropInfo fam = serv.getCropInfo(name);
				
				String issd=fam.getName();
				String blank="";
				if(issd.equals(blank))
				{
					System.out.println("This is NUll");
				}
				
				return new ResponseEntity<>(fam, HttpStatus.OK);
				
			} catch (Exception e) {
				// Handle any other exceptions here
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}