/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type out a sentence");
		String x = sc.nextLine();
		while(true){
			if(x.indexOf(" ") == -1){
			System.out.print(spongeCase(x));
				break;
			}
			int space = x.indexOf(" ");
			String word = x.substring(0, space);
			System.out.print(spongeCase(word) + " ");
			x = x.substring(space + 1);
		}
	}
	
	
	public static String spongeCase(String b){
			String a = new String();
			String result = new String();
		for(int i = 0; i < b.length();i++){
			a = b.substring(i, i+1);
			if(i % 2 != 0){
				a = (a.toUpperCase());
			}
			else{
				a =(a.toLowerCase());
			}
			result = result + a;
		}
		return result;
	}
}


	