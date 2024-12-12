/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int a){
		if(a % 4 == 0){
		return true;	
		}
		else{
			return false;
		}
	}
	
	
	
	public static int getDigitSum(int a){
		int count;
		int b = a / 10000;
		count = b;
		int c = (a/1000) - (count*10);
		count = (count * 10) + c;
		int d = (a/100) - (count*10);
		count = (count * 10) + d;
		int e = (a/10) - (count*10);
		count = (count * 10) + e;
		int f = (a) - (count*10);
		count = b + c + d + e + f;
		return count;
	}
	
	

	public static void printIfConsecutive(int a, int b, int c){
		if(b - a ==  1 && c - b == 1){
			System.out.println("" + a + ", " + b + ", " + c + " are consecutive");
		}
		else{
			System.out.println("" + a + ", " + b + ", " + c + " are not consecutive");
		}
		return;
	}


	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");
		System.out.println();
		
		
		
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);
		System.out.println();
		
		
		
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
