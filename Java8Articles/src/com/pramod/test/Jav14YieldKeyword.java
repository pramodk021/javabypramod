package com.pramod.test;

public class Jav14YieldKeyword {

	public static void main(String[] args) {

		System.out.println(getDayType("Monday"));
	}

	public static String getDayType(String day) {
		var result = switch (day) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
			yield "Weekday";
		case "Saturday", "Sunday":
			yield "Weekend";
		default:
			yield "Invalid day.";
		};

		return result;
	}
}
