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
		System.out.println("What role would you like your character to be?");
		String a = sc.nextLine();
		BaseClass cha = new BaseClass(a);
		cha.myToString();
	}
}
