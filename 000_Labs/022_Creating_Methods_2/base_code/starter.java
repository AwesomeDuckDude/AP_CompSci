/*
 *	Author:  Saam Sadeghi
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		int num = a;
		while(b > 1){
		    num = num * a;
		    b--;
		}
		return num;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int a = sc.nextInt();
		System.out.println("What is your exponent?");
		int b = sc.nextInt();
		System.out.println("Your answer is: ");
		System.out.println(pow(a, b));


		
	}
}
