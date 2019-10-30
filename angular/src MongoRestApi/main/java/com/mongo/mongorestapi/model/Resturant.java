package com.mongo.mongorestapi.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Resturant {

	@Id
	private String resturantId;
	private String name;
	private Date creationDate = new Date();
	private Map<String, String> resturantItems = new HashMap<>();
	public String getResturantId() {
		return resturantId;
	}
	public void setResturantId(String resturantId) {
		this.resturantId = resturantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Map<String, String> getResturantItems() {
		return resturantItems;
	}
	public void setResturantItems(Map<String, String> resturantItems) {
		this.resturantItems = resturantItems;
	}


}
