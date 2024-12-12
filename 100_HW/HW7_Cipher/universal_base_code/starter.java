/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cipher decode = new Cipher();
        System.out.println("Does you're code require a key? (y/n)");
        String idk = sc.nextLine();
        if(idk.equals("y")){
    		System.out.println("What would you like to decipher?");
        	String code = sc.nextLine();
        	System.out.println("What is the key?");
        	int key = sc.nextInt();
    	    System.out.println(decode.keyedEncode(code, key));
        }
        else if(idk.equals("n")){
    		System.out.println("What would you like to decipher?");
        	String code = sc.nextLine();
        	System.out.println(decode.encode(code));
        }
    }
}