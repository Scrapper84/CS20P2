package SkillBuilders;

import java.util.Scanner;

public class numberssum 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		
		 int num = input.nextInt();
		
		int newvalue, nextNum, remainder, digitSum = 0;
		
		 
		do
		{
			remainder = num % 10;
			digitSum = digitSum + remainder;
			newvalue = num - remainder;
			num = num / 10;
			
		}while (newvalue != 0);

		System.out.println("every number between 1-" + digitSum);
		
	}

}
