package Mastery;

import java.util.Scanner;

public class carrecall {
	
	public static void main(String[] args) {
		
		int carmodel;
		//int badcarmodel1 = 119;
		//int badcarmodel2 = 179;
		//int badcarmodel3 = 189;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cars's model number: ");
		carmodel = input.nextInt();
		
		switch(carmodel)
		{
		case 119:
		case 179:
		case 189:
		case 195:
		case 196:
		case 197:
		case 198:
		case 199:
		case 200:
		case 201:
		case 202:
		case 203:
		case 204:
		case 205:
		case 206:
		case 207:
		case 208:
		case 209:
		case 210:
		case 211:
		case 212:
		case 213:
		case 214:
		case 215:
		case 216:
		case 217:
		case 218:
		case 219:
		case 220:
		case 221:
		case 780:
			System.out.println("Your car is defective. It must be repaired.");
			break;
		default:
			System.out.println("Your car is not defective.");
			break;
		}

	}

}
