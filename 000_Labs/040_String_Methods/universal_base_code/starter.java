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
		String b = new String ("");
		System.out.println("Enter your first and last name");
		String a = sc.nextLine();
		for(int i = 0; i < a.length(); i++){
			if(a.substring(i, i+1).equals(" ")){
				b = a.substring(i+1);
			}
			
		}
		System.out.println("Your Last name is " + b);


		
	}
}
