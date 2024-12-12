/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an Alien Exchange Program");
        System.out.println("Pick an Alien to take in");
        System.out.println("1. Joe, a fat bellied alien who loves eating pizza");
        System.out.println("2. Bob , a blue alien who loves trees");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies");
        System.out.println("Enter the number of the alien you want");
        int o1 = sc.nextInt();
        
        if(o1 == 1){
            System.out.print("You've selected Joe!");
            System.out.println("What type of pizza do you get for Joe?");
            System.out.println("1. Coscto");
            System.out.println("2. Domioes");
            System.out.println("3. Little Cesar’s ");
            System.out.println("Enter the number of the pizza place you go to: ");
            int o2 = sc.nextInt();
            if(o2 == 1)
                System.out.println("He devoured it in seconds!");
            else if(o2 == 2)
                System.out.println("He enjoyed the meal!");
            else if(o2 == 3)
                System.out.println("He died of food poisoning");
            else
                System.out.println("You got him in-n-out and he loved it!");
        }
        else if(o1 == 2){
            System.out.println("You've selected Bob!");
            System.out.println("Bob wants a survival game for birthday");
            System.out.println("1. Minecraft");
            System.out.println("2. The Forest");
            System.out.println("3. Rust");
            System.out.println("Enter the number of the game you get him: ");
            int o2 = sc.nextInt();
            if(o2 == 1)
                System.out.println("He loved the many different types of trees!");
            else if(o2 == 2)
                System.out.println("He was astonished by the ammount of trees there were!");
            else if(o2 == 3)
                System.out.println("He kept getting spawn killed and quit after an hour");
            else
                System.out.println("You got him Fortnite");
        }
        else if (o1 == 3){
            System.out.println("You've selected Barney!");
            System.out.println("Barney wants a butterfly collection");
            System.out.println("1. You dont get him any butterflies");
            System.out.println("2. You get him an open butterfly garden he can walk in");
            System.out.println("3. You get him an enclosed butterfly garden he cant enter");
            System.out.println("Enter the number of the choice you pick: ");
            int o2 = sc.nextInt();
            if(o2 == 1)
                System.out.println("He ran away out of sadness");
            else if(o2 == 2)
                System.out.println("The butterflies all went missing after a week");
            else if(o2 == 3)
                System.out.println("The butterflies lived long happy lives");
            else
                System.out.println("You got him an ant farm");
        }
        else{
            System.out.println("Thats not an option, you get Jerry");
            System.out.println("Jerry is very rude to you so you send him back");
        }
	}
}