/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random() * 1000);
		System.out.println("Guess the random number between 1 and 1000");
		while(true){
			int guess = sc.nextInt();
			if (guess == random){
				System.out.println("Correct!");
				break;
			}
			else if(guess > random){
				System.out.println("Too High! Guess Again!");
			}
			else if(guess < random){
				System.out.println("Too Low! Guess Again!");
			}
		}
	}
}
