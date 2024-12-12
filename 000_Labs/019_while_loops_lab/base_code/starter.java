/*
 *	Author:  Saam Sadeghi
 *  Date: 9/23/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y = 0;
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times would you like it to be printed?");
		int x = sc.nextInt();
		while(true){
			System.out.println(name);
			if(y==x){
				break;
			}
			y = y + 1;
		}



		
	}
}
