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
		System.out.println("Enter a random sentence");
		String a = sc.nextLine();
		String result = new String("");
        while(true){
            if(a.indexOf(" ") == -1){
                result = a + " " + result;
                break;
            }
            int space = a.indexOf(" ");
            String word = a.substring(0, space);
            
            a = a.substring(space+1);
            result = word + " " + result;
            
        }
        System.out.print(result);
	}
}
