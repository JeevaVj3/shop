package com.onesoft.log4jApply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDao {
	
	@Autowired
	ShopRepository sr;

	public String det(List<Shop> det) {
		sr.saveAll(det);
		return "Saved";
	}

	public List<Shop> get() {
		return sr.findAll();
	}

	public String post(Shop a) {
		sr.save(a);
		return "Success";
	}

}
