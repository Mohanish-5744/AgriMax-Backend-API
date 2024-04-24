package com.Agrimax.Agrimax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CropInfoService {
	
	@Autowired
	private CropInfoRepository repo;
	
	public List<CropInfo> SearchName(String name)
	{

//		System.out.println("Welcome to Services.  Search Query: "+ name);

		return (List<CropInfo>)repo.findByNameContainingIgnoreCase(name);
	}
	
	public CropInfo getCropInfo(String name){
		return repo.findByName(name);
	}
}