/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	public int s;
	public int d;
	public int i;
	public int c;

	public myCharacter() {
		role = "no role";
	}
	
	public myCharacter(String r){
		if (r.equals("wizard") || r.equals("warrior") || r.equals("rogue") || r.equals("Wizard") || r.equals("Warrior") || r.equals("Rogue")){
			role = r;
		}
		else{
			role = "no role";
		}
	}
	
	public String getRole(){
		return role;
	}

}
