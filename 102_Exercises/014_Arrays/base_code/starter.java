/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] idk = new int[1001];
		 int i = 0;
		 int a = 0;
		 while (i<idk.length){
		 	a = a + 3;
		 	idk[i] = a;
		 	System.out.print(idk[i] + ", ");
		 	
		 	i++;
		 }
		 System.out.println("\n---------------------------------------------------------------");
		 int[] idk2 = new int[1001];
		 i = 0;
		 a = 1000;
		 while(i<idk2.length){
		 	idk2[i] = a;
		 	System.out.print(idk2[i] + ", ");
		 	a--;
		 	i++;
		 }
	}
}
