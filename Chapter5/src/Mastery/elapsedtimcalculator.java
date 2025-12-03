package Mastery;

import java.util.Scanner;

public class elapsedtimcalculator {

	public static void main(String[] args) {
		
		int time;
		int hoursElapsed;
		int halfDays = 0;
		String timeofDay;
		
		int passhr;
		int endhr;
		
	

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the starting hour: ");
		time = input.nextInt();
		
		System.out.println("Enter am(1) or pm(2): ");
		timeofDay = input.next();
		
		System.out.println("Enter the number of elapsed hours: ");
		hoursElapsed = input.nextInt();
		
		halfDays = (time +  hoursElapsed - 12);
		time = (time + hoursElapsed) % 12;
		
		System.out.print("The time is: " + time);
		
		if(halfDays >= 0) //if halfDays are greater than zero
		{
			System.out.print("am");
		}
		else if (halfDays == 2)
		{
			System.out.print("pm"); //set your timeofDay to pm
		}
		else halfDays = 3;
		{
			System.out.print("am");
		}
		
		
		//Display new time --> time and timeofday
	}

}
