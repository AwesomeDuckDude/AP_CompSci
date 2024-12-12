/*
 *	Author: Saam Sadeghi 
 *  Date: 9/22/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int points = 20;
		System.out.println("What is your characters name?");
		String name = sc.nextLine();
		System.out.println("What is your characters title? (ex. Dragon Slayer)");
		String title = sc.nextLine();
		System.out.println("Do you want to be a Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();
		if(role.equals("Wizard")){
			System.out.println("You have selected Wizard!");
		}
		else if(role.equals("Warrior")){
			System.out.println("You have selected Warrior!");
		}
		else if(role.equals("Rogue")) {
			System.out.println("You have selected Rogue!");
		}
		else{
			System.out.println("Wrong input, make sure you type your selection exactly as its displayed! Run code again");
		}
		System.out.println("You have 20 skill points to spend on strenght, dexterity, intelligence, and charisma.\n");
		System.out.print("Strength (0-10): ");
		int strength = sc.nextInt();
		if(strength <=10){
			points = points - strength;
			System.out.println("you have " + points + " points left to spend\n");
		}
		else if(strength > 10){
			System.out.print("Please input a smaller value for strength (0-10): ");
			strength = sc.nextInt();
			points = points - strength;
			System.out.println("You have " + points + " points left to spend\n");
		}
		
		
		System.out.print("Dexterity (0-10): ");
		int dexterity = sc.nextInt();
		if(dexterity <=10){
			points = points - dexterity;
			System.out.println("you have " + points + " points left to spend\n");
		}
		else if(dexterity > 10){
			System.out.print("Please input a smaller value for dexterity (0-10): ");
			dexterity = sc.nextInt();
			points = points - dexterity;
			System.out.println("You have " + points + " points left to spend\n");
		}
		
		System.out.print("Intelligence (0-10): ");
		int intelligence = sc.nextInt();
		if(intelligence <= points){
			points = points - intelligence;
			System.out.println("you have " + points + " points left to spend\n");
		}
		else if(intelligence > points || intelligence > 10){
			System.out.println("You have " + points + " points left to spend\n");
			System.out.print("Please input a smaller value for intelligence (0-10): ");
			intelligence = sc.nextInt();
			points = points - intelligence;
			System.out.println("You have " + points + " points left to spend\n");
		}
		
		System.out.print("Charisma (0-10): ");
		int charisma = sc.nextInt();
		if(charisma <= points){
			points = points - charisma;
			System.out.println("you have " + points + " points left to spend\n");
		}
		else if(charisma > points || charisma > 10){
			System.out.println("You have " + points + " points left to spend\n");
			System.out.print("Please input a smaller value for charisma (0-10): ");
			charisma = sc.nextInt();
			points = points - charisma;
			System.out.println("You have " + points + " points left to spend\n");
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title);
		System.out.println("You're a " + role + " with the following stats:");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
	}
}
