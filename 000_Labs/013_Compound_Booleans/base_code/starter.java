/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int l = 0;
		String large = new String();
		int s = 0;
		String small = new String();
		System.out.println("Enter an int:");
		int x = sc.nextInt();
		System.out.println("Enter another int:");
		int y = sc.nextInt();
		System.out.println("Enter another int:");
		int z = sc.nextInt();
		if(x > y){
			if(x>z){
				large = "first";
				l = x;
			}
			else{
				large = "third";
				l = z;
			}
		}
		else{
			if(y>z){
				large = "second";
				l = y;
			}
		}
		if(x<y){
			if(x<z){
				small = "first";
				s = x;
			}
			else{
				small = "thrid";
				s = z;
			}
		}
		else{
			if(y<x){
				small = "second";
				s = y;
			}
		}
		System.out.println("The " + large + " int was the largest with a value of: " + l);
		System.out.println("The " + small + " int was the smallest with a value of: " + s);
	}
}
