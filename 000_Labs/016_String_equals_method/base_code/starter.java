/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Wizard, Warrior, or a Rogue");
		String role = sc.nextLine();
		if(role.equals("Wizard")){
			System.out.print("You have selected Wizard!");
		}
		else if(role.equals("Warrior")){
			System.out.print("You have selected Warrior!");
		}
		else if(role.equals("Rogue")) {
			System.out.print("You have selected Rogue!");
		}
		else{
			System.out.print("Wrong input, make sure you type your selection exactly as its displayed!");
		}
	}
}
