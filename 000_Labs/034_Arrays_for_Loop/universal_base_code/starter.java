/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] idk = new int[1001];
		int a ;
		for(int i = 0; i < idk.length; i++){
			a = (int)(Math.random() * 1000);
		 	idk[i] = a;
		 	System.out.print(idk[i] + ", ");
		}
	}	
}
