package com.cognizant.designPatterns;

public class AccessoryRepair implements IAccessoryRepair{

	@Override
	public void ProcessAccessoryRepair(String accessoryName) {
		System.out.println(accessoryName + " repair accepted!");
	}

}
