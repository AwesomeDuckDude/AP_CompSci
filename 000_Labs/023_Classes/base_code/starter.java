/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
	int s = 5;
	int d = 5;
	int i = 5;
	int rizz = 5;
	
}

class starter {
	public static void main(String args[]) {
		Character mychar = new Character();
		System.out.println("Your role is " + mychar.role);
		System.out.println("Your Strength is: " + mychar.s);
		System.out.println("Your Dexterity is: " + mychar.d);
		System.out.println("Your Intelligence is: " + mychar.i);
		System.out.println("Your Charisma is: " + mychar.rizz);
	}
}
