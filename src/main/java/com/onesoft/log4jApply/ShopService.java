package com.onesoft.log4jApply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
	
	@Autowired
	ShopDao sd;

	public String det(List<Shop> det) {
		return sd.det(det);
	}

}
