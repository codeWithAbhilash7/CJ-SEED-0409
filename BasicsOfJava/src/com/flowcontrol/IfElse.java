package com.flowcontrol;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// min exp 5 years
		// gender female

		float yearsOfExperience = 6.4f;
		String gender = "female";

		if (yearsOfExperience >= 5 && gender.equals("female")) {
			System.out.println("Congrats!!! You are eligible...:)");
		} else if (yearsOfExperience < 5) {
			System.out.println("Your experince does not meet with the expectations...");
		} else if (!gender.equals("female")) {
			System.out.println("Your gender does not meet with the expectations...");
		} else {
			System.out.println("Ohhh so sorry!!! You are NOT eligible...:)");
		}

		if (gender.equals("female")) {
			if (yearsOfExperience >= 5) {
				System.out.println("Congrats!!! You are eligible...:)");
			} else {
				System.out.println("Your experince does not meet with the expectations...");
			}
		} else {
			System.out.println("Your gender does not meet with the expectations...");
		}
	}

}
