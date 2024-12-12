/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf dwarf = new PooleDwarf(randName(), 1);
		PooleDwarf dwarf2 = new PooleDwarf(randName(), 2);
		PooleDwarf dwarf3 = new PooleDwarf(randName(), 3);
		PooleDwarf dwarf4 = new PooleDwarf(randName(), 4);
		PooleDwarf dwarf5 = new PooleDwarf(randName(), 5);
		PooleDwarf dwarf6 = new PooleDwarf(randName(), 6);
		PooleDwarf dwarf7 = new PooleDwarf(randName(), 7);
		int i = 0;
		if(dwarf.isSameName(dwarf2.getName())){
			i++;
		}
		if(dwarf.isSameName(dwarf3.getName())){
			i++;
		}
		if(dwarf.isSameName(dwarf4.getName())){
			i++;
		}
		if(dwarf.isSameName(dwarf5.getName())){
			i++;
		}
		if(dwarf.isSameName(dwarf6.getName())){
			i++;
		}
		if(dwarf.isSameName(dwarf7.getName())){
			i++;
		}
			System.out.println(i + " dwarfs are named "+ dwarf.getName());
		}
}

