/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sentance");
		String sentance = sc.nextLine();
		String finalSentance = (" ");
		while(true){
			if(sentance.indexOf(" ") ==-1){
				sentance = toPigLatin(sentance);
				finalSentance = finalSentance+sentance;
				break;
			}
		int space = sentance.indexOf(" ");
		String word = sentance.substring(0, space);
		sentance = sentance.substring(space+1);
		word = toPigLatin(word);
		finalSentance = finalSentance + word + " ";
		}
		System.out.println(finalSentance);
	}
	
	public static String toPigLatin(String a){
		String l1 = (a.substring(0,1));
		if(a.length() > 1){
			String l2 = (a.substring(1,2)); 
			if(!isVowel(l1)&&!isVowel(l2)){
				a = a.substring(2) + "-" + a.substring(0,2) + "ay";
			}
			else if(isVowel(l1)){
				a = a+"-way";
			}
			else{
				a = a.substring(1) + "-" + a.substring(0,1) + "ay";
			}
			return a;
		}
		else{
			if(isVowel(l1)){
				a = a+"-way";
			}
			else{
				a = a.substring(1) + "-" + a.substring(0,1) + "ay";
			}
			return a;
		}
	}
	
	public static boolean isVowel(String vowel){
		if(vowel.equals("A")||vowel.equals("a")||vowel.equals("E")||vowel.equals("e")||vowel.equals("I")||vowel.equals("i")||vowel.equals("O")||vowel.equals("o")||vowel.equals("U")||vowel.equals("u")){
			return true;
		}
		else{
			return false;
		}
	}
	
}
