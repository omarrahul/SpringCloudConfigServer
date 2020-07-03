package com.microservices.configuration.rangeservice.service;

import org.springframework.stereotype.Service;

@Service
public class RangeService {

	public int evaluateAverage(int minRange, int maxRange){
		return (minRange+maxRange)/2;
	}
}
