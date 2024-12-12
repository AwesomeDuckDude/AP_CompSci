package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?
	
	//-------------------------------------------------------------------

	public Spiderman(){
		actor = "unknown";
		age = 0;
		villain = "Unknown";
	}
	
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "Unknown";
	}
	
	public Spiderman(int a){
		actor = "Unknown";
		age = a;
		villain = "Unknown";
	}
	
	public Spiderman(String a, int a2){
		actor = a;
		age = a2;
		villain = "Unknown";
	}
	
	public Spiderman(String a, int a2, String v){
		actor = a;
		age = a2;
		villain = v;
	}
	
	//-------------------------------------------------------------------
	
	public void setActor(String a){
		actor = a;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setVillain(String v){
		villain = v;
	}
	
	public String getActor(){
		return actor;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getVillain(){
		return villain;
	}
	
	//-------------------------------------------------------------------
	
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
