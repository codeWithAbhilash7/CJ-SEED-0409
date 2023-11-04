package com;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);
		LocalDate nextDate = today.plusDays(15);
		System.out.println("Next Date : " + nextDate);

		LocalDate independanceDay = LocalDate.of(1947, 8, 15);
		System.out.println("Independance Day : " + independanceDay);

		Period yearsOfInd = Period.between(independanceDay, today);
		System.out.println("Period between Independannce and today : " + yearsOfInd);
		System.out.print(yearsOfInd.getYears()+ " years ");
		System.out.print(yearsOfInd.getMonths()+ " months ");
		System.out.print(yearsOfInd.getDays() + " days ");

		LocalTime currentTime = LocalTime.now();
		System.out.println("Current time : " + currentTime);

		LocalTime time = LocalTime.of(19, 00, 00);
		// System.out.println(time);

		Duration d = Duration.between(currentTime, time);
		System.out.println("Duration between " + currentTime + " and " + time + " is : " + d);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current date and time : " + current);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
		System.out.println("Formatted Date : " + current.format(formatter));
	}

}
