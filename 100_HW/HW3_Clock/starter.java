/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day of the week is it? ex.(1-Sun, 2-Mon, 3-Tue etc)");
		int day = sc.nextInt();
		if(day >= 2 && day <=6){
			System.out.print("It's a weekday! You have to wake up at 7:00am!");
		}
		else if(day == 1 || day == 7){
			System.out.print("It's the weekend! You have to wake up the 10:00am!");
		}
		else{
			System.out.print("Input Error, Rerun Code");
		}
	}
}
