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
		else if(guess > num){
			System.out.println("Your guess was too big, the correct number was " + num + ". Try again?"); 
		}
		else if(guess < num){
			System.out.println("Your guess was too small, the correct number was " + num + ". Try again?"); 
		}

		
	}
}