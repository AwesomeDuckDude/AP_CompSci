import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		boolean l1;
		boolean l2;
		
        String a = new String();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int c = 0; c< passwords.length; c++){
            a = passwords[c];
            if(a.length() >= 8){
                c1++;
                l1 = true;
            }
            else{
                l1 = false;
            }
            if(a.contains("!") || a.contains("@") || a.contains("$") || a.contains("#") || a.contains("%") || a.contains("^") || a.contains("&") || a.contains("*")){
                c2++;
                l2 = true;
            }
            else{
                l2 = false;
            }
            if(l1 && l2){
                c3++;
            }
        }
        c2 = c2 - c3;
        c1 = c1 - c3;
        System.out.println(c1 + " passwords have a strength of one");
        System.out.println(c2 + " passwords have a strength of two");
        System.out.println(c3 + " passwords have a strength of three");
	}
}
