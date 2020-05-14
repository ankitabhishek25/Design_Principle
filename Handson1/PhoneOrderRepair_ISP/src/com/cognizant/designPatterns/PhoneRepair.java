package com.cognizant.designPatterns;

public class PhoneRepair implements IPhoneRepair{

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!");
	}

}
