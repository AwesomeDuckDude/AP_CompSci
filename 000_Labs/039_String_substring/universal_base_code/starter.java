/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a random word");
		String a = sc.nextLine();
		for(int i = 0; i < a.length(); i++){
			System.out.println(i + " " + a.substring(i, i+1));
		}

		
	}
}
