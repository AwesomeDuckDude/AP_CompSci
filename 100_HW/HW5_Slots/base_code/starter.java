/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int num1;
		int num2;
		int num3;
		System.out.println("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\n   a. If two numbers match, you double your money.\n   b. If three numbers match, you triple your money.\n   c. If none match, you lose your money.\n--------------------------------------------------\n");
		while(true){
			System.out.println("Would you like to play slots? (yes/Yes/Y/y)");
			String slots = sc.nextLine();
			if(slots.equals("Yes") ||  slots.equals("yes") || slots.equals("Y") || slots.equals("y")){	
				System.out.println("You have " + money +"$, how much would you like to bet?");
				int bet = sc.nextInt();
				while(true){
					if(bet > money){
						System.out.println("Too much! You have " + money + "$ enter an ammount lower than that to bet");
						bet = sc.nextInt();
					}
					else if(bet <= 0){
						System.out.println("Cannot bet 0 or a negative. You have " + money + "$, how much do you want to bet?");
						bet = sc.nextInt();
					}
					else{
						break;
					}
				}
				num1 = (int)(Math.random() * 9) + 1;
				num2 = (int)(Math.random() * 9) + 1;
				num3 = (int)(Math.random() * 9) + 1;
				System.out.println("Lets Play!");
				System.out.println("Your Numbers are: ");
				System.out.println("_______________________");
				System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");
				System.out.println("_______________________");
				if(num1 == num2){
					if(num2 == num3){
						bet = bet * 2;
						money = money + bet;
						System.out.println("Jackpot! You won 3x your bet");
						System.out.println("You have " + money);
					}
					else{
						money = money + bet;
						System.out.println("Jackpot! You won 2x your bet");
						System.out.println("You have " + money);
					}
				}
				else if(num1 == num3){
					money = money + bet;
					System.out.println("Jackpot! You won 2x your bet");
					System.out.println("You have " + money);
				}
				else if(num2 == num3){
					money = money + bet;
					System.out.println("Jackpot! You won 2x your bet");
					System.out.println("You have " + money);
				}
				else{
					System.out.println("Aww man, you didnt win this time");
					money = money - bet;
					System.out.println("You have " + money);
				}
				System.out.println("\n--------------------------------------------------");
			}
			else if(slots.equals("No") ||  slots.equals("no") || slots.equals("N") || slots.equals("n")){
				System.out.println("See you soon! You ended with " + money + "$");
				break;
			}
			
		}
	}
}