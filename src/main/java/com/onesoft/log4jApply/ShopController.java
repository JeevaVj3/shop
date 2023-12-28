package com.onesoft.log4jApply;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop")
public class ShopController {
	
	@Autowired 
	ShopService ss;
	
	static Logger log = Logger.getLogger(ShopController.class);
	
	@PostMapping("postall")
	public String msg(@RequestBody List<Shop> det) {
		PropertyConfigurator.configure("log.properties");
		log.info(det);
		return ss.det(det);
	}

}
