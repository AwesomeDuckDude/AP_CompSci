/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int [20];
		int a = (int)(Math.random() * 10) + 1;
		int b = 0;
		System.out.println("The random number is " + a);
		for(int i = 0; i < 20; i++){
			arr[i] = (int)(Math.random() * 10) + 1;
			if(arr[i] == a){
				System.out.println("Duplicate found at " + i);
				b++;
			}
		}
		System.out.println("There are " + b + " duplicates of " + a);
		for(int i = 1; i < 20; i++){
			int c = i - 1;
			if(arr[i] == arr[c]){
				System.out.println("Two in a row found at " + i + " and " + c + ". The number is " + arr[i]);
			}
		}
	}
}
