package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
	
	int num;
	int firstDigit, secondDigit;
	
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter a two digit number: ");//Prompt
	num = input.nextInt();//Input recording
	
	firstDigit = num / 10;
	System.out.println("First digit is: " + firstDigit);
	
	secondDigit = num % 10;
	System.out.println("second digit is: " + secondDigit);
	
	
	}

}
