/*
 *	Author: Saam Sadeghi  
 *  Date: 9/9/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int x = sc.nextInt();
		System.out.println("Enter another number:  ");
		int y = sc.nextInt();
		if(x == y){
			System.out.println(x + " and " +  y + " are equal!");
		}
		else{
			System.out.println(x + " and " + y + " are not equal :( ";
		}
		 
	}
}
