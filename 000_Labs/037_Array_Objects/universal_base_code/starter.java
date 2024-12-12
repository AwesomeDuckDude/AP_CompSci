/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int wan = 0;
		int win = 0;
		Warrior[] wa = new Warrior[100];
		Wizard[] wi = new Wizard[100];
		for(int i = 0; i < 100; i++){
			wa[i] = new Warrior();
			wi[i] = new Wizard();
		}
		while(true){
			if(wan > 99){
				int a = 100 - win;
				System.out.println("The wizards won with " + a + " left in their army");
				break;
			}
			if(win > 99){
				int b = 100 - wan;
				System.out.println("The wizards won with " + b + " left in their army");
				break;
			}
			wi[win].attack(wa[wan]);
			wa[wan].attack(wi[win]);
			if(wa[wan].isDead()){
				wan++;
			}
			if(wi[win].isDead()){
				win++;
			}
		}
	}
}
