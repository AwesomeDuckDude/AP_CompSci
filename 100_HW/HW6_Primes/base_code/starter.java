/*
 *	Author: Saam Sadeghi
 *  Date: 10/13/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static boolean checkPrime(int a){
		int divide = a - 1;
		boolean isPrime = false;
			while(divide > 1){
				if(a % divide == 0){
					isPrime = false;
					break;
				}
				isPrime = true;
				divide--;
			}
		return isPrime;
	}
	
	
	public static void printPrimes(int b){
		boolean check;
		while(b >=0){
			check = checkPrime(b);
			if(check == true){
				System.out.println(b);
			}
			else if(b == 2){
				System.out.println(b);
			}
			b--;
		}
		return;

	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter a random int: ");
		int prime = sc.nextInt();
		System.out.println("The prime numbrs less than or equal to " + prime + " are: ");
		printPrimes(prime);
		
		
	}
}

