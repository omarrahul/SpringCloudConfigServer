package com.microservices.configuration.rangeservice.controller;

import com.microservices.configuration.rangeservice.bean.RangeConfiguration;
import com.microservices.configuration.rangeservice.config.Configuration;
import com.microservices.configuration.rangeservice.service.RangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RangeConfigController {

	@Autowired
	RangeService rangeService;

	@Autowired
	Configuration configuration;

	@GetMapping("/range")
	public RangeConfiguration retrieveRange(){
			RangeConfiguration rangeConfiguration = new RangeConfiguration(configuration.getMinRange(),configuration.getMaxRange());
			int average = rangeService.evaluateAverage(configuration.getMinRange(),configuration.getMaxRange());
			rangeConfiguration.setAverage(average);
			return rangeConfiguration;
	}
}
