/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	public int s;
	public int d;
	public int i;
	public int c2;
	public int c;

	public BaseClass() {
		role = "no role";
		s = 0;
		d = 0;
		i = 0;
		c2 = 0;
		c = 0;
		
	}
	
	public BaseClass(String r){
		if(r.equals("wizard") || r.equals("Wizard")){
			role = "Wizard";
			s = 2;
			d = 1;
			i = 10;
			c2 = 4;
			c = 7;
		}
		else if(r.equals("warrior") || r.equals("Warrior")){
			role = "Warrior";
			s = 10;
			d = 5;
			i = 3;
			c2 = 7;
			c = 1;
		}
		else if(r.equals("rogue") || r.equals("Rogue")){
			role = "Rogue";
			s = 4;
			d = 5;
			i = 8;
			c2 = 1;
			c = 10;
		}
		else{
			role = "no role";
			s = 0;
			d = 0;
			i = 0;
			c2 = 0;
			c = 0;	
		}
	}
	public void myToString(){
		System.out.println("------------------------------");
		System.out.println(role);
		System.out.println("Your Strength is: " + s);
		System.out.println("Your Dexterity is: " + d);
		System.out.println("Your Intelligence  is: " + i);
		System.out.println("Your Constitution is: " + c2);
		System.out.println("Your Charisma is: " + c);
		System.out.println("------------------------------");
		System.out.println("");

	}

}

