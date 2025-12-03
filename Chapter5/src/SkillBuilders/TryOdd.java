package SkillBuilders;

import java.util.Scanner;

public class TryOdd 
{

	public static void main(String[] args) 
	{
		int max;
		int sum = 0;
		int step = 2;
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a maximum value: ");
		max = input.nextInt();
		input.close();

		for(int i = 1; i <= max; i += step) {
			sum = sum + i;
		}
		System.out.println("The sum of the odd numbers from 1 to " + max + " is: " + sum);
	}

}
