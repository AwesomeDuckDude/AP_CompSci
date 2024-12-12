/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * 1000);
		System.out.println("Guess the number from 1-1000: ");
		int guess = sc.nextInt();
		if(guess == num){
			System.out.println("Your guess was correct!");
		}
		else{
			System.out.println("Your guess was wrong, the correct number was " + num + ". Try again?");
		}
		
	}
}
