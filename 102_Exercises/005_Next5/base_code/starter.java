/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		System.out.println("Here are the next 5 numbers after your number:");
		System.out.print(num + 1 + ", ");
		System.out.print(num + 2 + ", ");
		System.out.print(num + 3 + ", ");
		System.out.print(num + 4 + ", ");
		System.out.println(num + 5);
		System.out.println("Here are the next 5 muntiples of your number:");
		System.out.print(num * 2 + ", ");
		System.out.print(num * 3 + ", ");
		System.out.print(num * 4 + ", ");
		System.out.print(num * 5 + ", ");
		System.out.println(num * 6);
		double num2 = num;
		System.out.println("Here is your nubmer divided by 100:");
		System.out.println(num2 / 100);
		System.out.println("Here is your nubmer divided by 10:");
		System.out.print(num2 / 10);


	}
}
