/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void printStats(myCharacter idk){
		System.out.println("Your Strength is: " + idk.s);
		System.out.println("Your Dexterity is: " + idk.d);
		System.out.println("Your Intelligence is: " + idk.i);
		System.out.println("Your Charisma is: " + idk.c);
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter idk = new myCharacter();
		System.out.println("You've chosen " +  idk.getRole() + "!");
		printStats(idk);
		System.out.println("------------------------------------------------");
		System.out.println("What would you like your're role to be?");
		String a = sc.nextLine();
		myCharacter idk1 = new myCharacter(a);
		String c = idk1.getRole();
		if(c.equals("no role")){
			System.out.println("Missinput, Rerun");
			System.out.println("You've chosen " + c + "!");
			printStats(idk1);
		}
		else{
			System.out.println("You've chosen " + c + "!");
			printStats(idk1);
		}
	}
}
