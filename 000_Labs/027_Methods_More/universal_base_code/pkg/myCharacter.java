/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int dexterity;
	int charisma;
	int inteligence;
	int strength;

	public myCharacter(){
	role = " No Role";
	dexterity = 0;
	charisma = 0;
	inteligence = 0;
	strength = 0;
    
		
	}
	public void myToString(){
		System.out.println("----------------------");
		System.out.println("Your role is : "+ role);
		System.out.println("Your dexterity is : " + dexterity);
		System.out.println("Your charisma is : " + charisma);
		System.out.println("Your intelegence is : "+inteligence);
		System.out.println("Your strength is : "+strength);
		System.out.println("-----------------------");
	}
	public void setRole(String r){
	
	if(r.equals("Wizard")|| r.equals("wizard")||r.equals("Rogue")||r.equals("rogue")|| r.equals("Warrior")||r.equals("warrior") ){
		role = r;	
	}
	else{
	role = "Miss Input for Role";	
	}
	}
	public void setDexterity(int d){
		dexterity = d;
		if(d <= 0){
			dexterity = 0;
		}
	
	}
	public void setCharisma(int c){
		charisma = c;
		if(c <= 0){
			c = 0;
		}
	
	}
	public void setInteligence(int i){
		inteligence = i;
		if(i <= 0){
			inteligence = 0;
		}
	
	}
	public void setStrength(int s){
		strength = s;
		if(s <= 0){
			strength = 0;
		}
	
	}
	public boolean setAll(String s, int a, int b , int c , int d){
	boolean lost = true;
		if(s.equals(" No Role")){
			lost = true;
		}else{
			lost = false;
		}
		if(a <= 0 || b <= 0 || c <= 0 || d <= 0 ){
			lost = false;
		}
		else{
			lost = true;
		}
		return lost;
	}
	


}