package com.mongo.mongorestapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mongo.mongorestapi.model.Resturant;


@Component
public class ResturantDao {

	@Autowired
	private MongoTemplate mongoTemplate;


	public List<Resturant> getAllResturants() {
		return mongoTemplate.findAll(Resturant.class);
	}

	public Resturant getResturantById(String resturantId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("resturantId").is(resturantId));
		return mongoTemplate.findOne(query, Resturant.class);
	}

	public Resturant saveResturant(Resturant resturant) {
		mongoTemplate.save(resturant);
		return resturant;
	}

	public Object getAllResturantItems(String resturantId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("resturantId").is(resturantId));
		Resturant resturant = mongoTemplate.findOne(query, Resturant.class);
		return resturant != null ? resturant.getResturantItems() : "Resturant not found.";
	}

	
	public String getResturantItems(String resturnId, String key) {
		Query query = new Query();
		query.fields().include("resturantItems");
		query.addCriteria(Criteria.where("resturantId").is(resturnId).andOperator(Criteria.where("resturantItems." + key).exists(true)));
		Resturant resturant = mongoTemplate.findOne(query, Resturant.class);
		return resturant != null ? resturant.getResturantItems().get(key) : "Not found.";
	}

	
	public String addResturantItems(String resturantId, String key, String value) {
		Query query = new Query();
		query.addCriteria(Criteria.where("resturantId").is(resturantId));
		Resturant resturant = mongoTemplate.findOne(query, Resturant.class);
		if (resturant != null) {
			resturant.getResturantItems().put(key, value);
			mongoTemplate.save(resturant);
			return "Key added.";
		} else {
			return "Resturant not found.";
		}
	}

	
}
