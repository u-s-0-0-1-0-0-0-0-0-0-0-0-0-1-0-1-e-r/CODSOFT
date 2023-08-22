package numberGame;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void game(int guess) {
     	int count=0;
		
		while(true) {
			    System.out.println("Give the input:");
			    Scanner sc = new Scanner(System.in);
			    int input=sc.nextInt();
			    count++;
			    if(count==10) {
			    	System.out.println("You lost!The number was "+guess+"!");
			    	break;
			    }
				if(guess==input) {
					System.out.println("Congratulations! You win! You did the right guess.");
					System.out.println("Bravo! You did the guess in "+count+" times.");
					break;
				}
				else if(((guess-input)>=1&&(guess-input)<=10)||((input-guess)>=1&&(input-guess)<=10)) {
					System.out.println("Try again! You are too close.");
				}
				else if(((guess-input)>=11&&(guess-input)<=20)||((input-guess)>=11&&(input-guess)<=20)) {
					System.out.println("Try again! You are close.");
				}
				else if(((guess-input)>=21&&(guess-input)<=30)||((input-guess)>=21&&(input-guess)<=30)) {
					System.out.println("Try again! You are a little bit far.");
				}
				else if(((guess-input)>=31&&(guess-input)<=40)||((input-guess)>=31&&(input-guess)<=40)) {
					System.out.println("Try again! You are a bit far.");
				}
				else if(((guess-input)>=41&&(guess-input)<=50)||((input-guess)>=41&&(input-guess)<=50)) {
					System.out.println("Try again! You are far . Catch me fast.");
				}
				else{
					System.out.println("Try Again. You are too far.");
				}
				System.out.println("You tried "+count+"times.");
			}
		    
		
		
		   System.out.println("Do you want to continue the again ? Y for yes and N for no.");
		    Scanner sc = new Scanner(System.in);
			char inp= sc.next().charAt(0);
			if(inp=='Y'||inp=='y') {
				Random rand=new Random();
				int guess2=rand.nextInt(100)+1;
				game(guess2);
			}
			
			else if(inp=='N'||inp=='n') {
				System.out.println("Thank you for having with me!");
			}
			else {
				System.out.println("Wrong input. Bye!");
			} 
	}
	

	public static void main(String[] args) {
		System.out.println("Let's play game!");
		System.out.println("You have 10 chances for each round till you guessed the right.");
		Random rand=new Random();
		int guess=rand.nextInt(100)+1;
		//System.out.println(guess);
	    game(guess);
	    
	    
	}

}
