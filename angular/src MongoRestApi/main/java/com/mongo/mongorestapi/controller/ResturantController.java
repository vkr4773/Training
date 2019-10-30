package com.mongo.mongorestapi.controller;

import java.util.ArrayList;
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

import com.mongo.mongorestapi.dao.ResturantDao;
import com.mongo.mongorestapi.model.Resturant;


@CrossOrigin
@RestController
public class ResturantController {

	@Autowired
	ResturantDao resturantService;
	
	@PostMapping(value="resturant")
	public Resturant saveResutrant(@RequestBody Resturant resturant)
	{
		return resturantService.saveResturant(resturant);
	}
	
	@GetMapping(value="resturant")
	public List<Resturant> getAllRest()
	{
		return resturantService.getAllResturants(); 
		
	}
	
	@GetMapping(value="resturant/{resturantId}")
	public Object getRest(@PathVariable String resturantId )
	{
		return resturantService.getResturantById(resturantId); 
		
	}
	
	
//	@DeleteMapping(value="resturant/{resturantId}")
//	public String deleteRest(@PathVariable int resturantId )
//	{
//		return resturantService.deleteResturant(resturantId); 
//		
//	}
	
//	@PutMapping(value="resturant")
//	public String updateRest(@RequestBody Resturant resturant )
//	{
//		return resturantService.updateResturant(resturant); 
//
//	}

}
