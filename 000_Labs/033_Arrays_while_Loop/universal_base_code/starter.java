/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] idk = new int[2147483646];
		int i = 0;
		int a = 0;
		while(i<idk.length){
		 	a = (int)(Math.random() * 1000);
		 	idk[i] = a;
		 	System.out.print(idk[i] + ", ");
		}
	}
}
