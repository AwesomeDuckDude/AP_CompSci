/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog idk = new Dog("BigDog");
		idk.setAge(6);
		Dog idk2 = new Dog("SmallDog", "MediumDog");
		boolean d1 = idk.isSleeping();
		if(d1){
			System.out.println(idk.getName() + " is sleeping");
		}
		else if(!d1){
			System.out.println(idk.getName() + " is awake");
			idk.bark();
		}
		if(idk2.isSleeping()){
			if(!d1){
				System.out.println(idk2.getName() + " wakes up from hearing " + idk.getName());
				idk2.bark();
			}
			else if(d1){
				System.out.println(idk2.getName() + " is sleeping");
			}
		}
		else if(!idk2.isSleeping()){
			System.out.println(idk2.getName() + " is awake");
			if(!d1){
				System.out.println(idk2.getName() + " hears " + idk.getName());
				idk2.bark();
			}

		}
	}
}