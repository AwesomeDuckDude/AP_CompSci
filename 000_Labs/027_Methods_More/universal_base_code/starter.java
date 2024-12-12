/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
// Your code goes below here
Scanner sc = new Scanner(System.in);
myCharacter idk = new myCharacter();
System.out.println("What is  your Role");
String r = sc.nextLine();
idk.setRole(r);
System.out.println("What is your Dexterity");
int d = sc.nextInt();
idk.setDexterity(d);
System.out.println("What is your Charisma");
int c= sc.nextInt();
idk.setCharisma(c);
System.out.println("What is your intelegence");
int i = sc.nextInt();
idk.setInteligence(i);
System.out.println("What is your Strength");
int s = sc.nextInt();
idk.setStrength(s);
idk.setAll(r,d,c,i,s);
idk.myToString();


}
}
