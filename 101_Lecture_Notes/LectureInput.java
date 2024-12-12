/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter an number:");
		int x = sc.nextInt();
		System.out.println("Enter another number:");
		int y = sc.nextInt();
		int z;
		z = x + y;
		System.out.println(x + " + " + y + " = " + z);
		System.out.println("What is your favorite food?");
        String food = sc.nextLine();
        
        
	}
}