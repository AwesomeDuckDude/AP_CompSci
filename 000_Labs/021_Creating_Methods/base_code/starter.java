/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static String toString(String a){
		System.out.println(a);
		return a;
	}
	public static String toStringCombined(String a, String b){
		System.out.println(a + " " + b);
		return b;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write something out");
		String a = sc.nextLine(); 
		System.out.println("Write something else out");
		String b = sc.nextLine(); 
		System.out.println("This is outputed using methods!");
		toString(a);
		toStringCombined(a, b);
		
		



		
	}
}
