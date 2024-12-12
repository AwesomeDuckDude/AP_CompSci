/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a random integer:");
		int x = sc.nextInt();
		System.out.println("Enter another random integer:");
		int y = sc.nextInt();
		if(x%2 == 0){
			System.out.println(x + " is even!");
		}
		else{
			System.out.println(x + " is odd!");
		}
		if(y%2 == 0){
			System.out.println(y + " is even!");
		}
		else{
			System.out.println(y + " is odd!");
		}
		if(x%3 == 0){
			System.out.println(x + " is divisible by three!");
		}
		else if(x%4 == 0){
			System.out.println(x + " is divisible by four!");
		}
		else if(x%5 == 0){
			System.out.println(x + " is divisible by five!");
		}
		else{
			System.out.println(x + " is not divisible by three, four, or five!");
		}
		
		if(y%3 == 0){
			System.out.println(y + " is divisible by three!");
		}
		else if(y%4 == 0){
			System.out.println(y + " is divisible by four!");
		}
		else if(y%5 == 0){
			System.out.println(y + " is divisible by five!");
		}
		else{
			System.out.println(y + " is not divisible by three, four, or five!");
			
		}


	}
}
