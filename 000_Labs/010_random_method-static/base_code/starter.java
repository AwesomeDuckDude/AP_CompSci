/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random() * 10);
		int y = (int)(Math.random() * 101);
		double z = Math.random();
		double a = Math.random() * 575; //589 - 14 = 575
		z = z + 2.5;
		a = a + 14.0; 
		System.out.println("A number between 0-9: " + x);
		System.out.println("A number between 0-100: " + y);
		System.out.println("A number between 2.5 and 3.5: " + z);
		System.out.println("A number between 14 and 589: " + a);
	}
}
