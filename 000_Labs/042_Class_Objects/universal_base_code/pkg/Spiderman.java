/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String actor;
	int age;	
	String villain;
	
	//-------------------------------------------------------------------

	public Spiderman(){
		actor = "Miles Morales";
		age = 13;
		villain = "King Pin";
	}
	
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "None";
	}
	
	public Spiderman(String a, int a2){
		actor = a;
		age = a2;
		villain = "None";
	}
	
	public Spiderman(String a, String a2){
		actor = a;
		age = 0;
		villain = a2;
	}
	
	public void setVillain(String v){
		villain = v;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void print(){
		System.out.println("--------------------------------");
		System.out.println("The actor " + actor + " is " + age + " years old.\nThey play Spiderman whos villain is " + villain);
		System.out.println("--------------------------------\n");
	}
}
