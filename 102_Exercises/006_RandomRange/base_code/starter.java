/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		System.out.println("Enter another number that is bigger than the first one:");
		int num2 = sc.nextInt();
		System.out.println("Your range is " + num1 + " to " + num2);
		System.out.println("Here are five numbers in your range");
		int range = num2 - num1;
		System.out.print((int)(Math.random() * range) + num1 + ", ");
		System.out.print((int)(Math.random() * range) + num1 + ", ");
		System.out.print((int)(Math.random() * range) + num1 + ", ");
		System.out.print((int)(Math.random() * range) + num1 + ", ");
		System.out.print((int)(Math.random() * range) + num1);
	}
}
