package com.cognizant.designPatterns;

public class AccessoryRepair implements IAccessoryRepair{

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted!");
	}

}
