package com.caseStudy;

public class TrainNotAvailableException extends Exception {

	@Override
	public String getMessage() {
		return "Train with given train number does not exist";
	}
	
}
