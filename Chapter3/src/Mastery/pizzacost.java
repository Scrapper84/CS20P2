package Mastery;

import java.util.Scanner;

public class pizzacost {

	public static void main(String[] args) {
		
		int pizzadiam;
		double labor = 0.75;
		double rentCost =1.0;
		
		
		double materials;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the diameter of the pizza in inches: ");
		pizzadiam = input.nextInt();
		materials = 0.05 * pizzadiam * pizzadiam;
		
		double pizzacost = labor + materials + rentCost;
		
		System.out.println("the cost of making the pizza is " + pizzacost);

	}

}
