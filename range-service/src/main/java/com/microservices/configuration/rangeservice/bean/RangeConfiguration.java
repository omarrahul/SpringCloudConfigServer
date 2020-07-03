package com.microservices.configuration.rangeservice.bean;

public class RangeConfiguration {

	int minRange;
	int maxRange;
	int average;

	protected RangeConfiguration(){

	}

	public RangeConfiguration(int minRange, int maxRange) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}
}
