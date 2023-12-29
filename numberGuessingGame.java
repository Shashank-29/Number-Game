
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame
{
	public static void main(String[] args) {
	    int count=0;
	    int score=0;
		System.out.println("*****Welcome to Number Guessing Game*****");
		Random rand= new Random();
		int randNum= rand.nextInt(100)+1;
	   System.out.println(randNum);
		Scanner scanner= new Scanner(System.in);
		while(true){
	    	System.out.println("\nEnter your guess(1-100): ");
	        int str= scanner.nextInt();
	        if(str==randNum){
    		    System.out.println("You guessed it right! The number is "+str+".");
    		    score=(score+100)-count*10;
    		    System.out.println("\nYour score is "+score+"\n");
    		    System.out.println("Would you like to play once more?: ");
    		    char x= scanner.next().charAt(0);
    		    if(x=='y'){
    		        randNum= rand.nextInt(100)+1;
    		        count=0;
    		        System.out.println(randNum);
    		        continue;
    		    }
    		    else{
    		        break;
    		    }
    		}
    		else if(count>3){//3+2=5 trials totally
    		    System.out.println("You have exceeded the number of trials!");
    		    break;
    		}
	        else if(str<randNum){
	            System.out.println("You guess is too less, Try again!");
	            count++;
	        }
	        else {
	            System.out.println("You guess is too high, Try again!");
	            count++;
	        }
		    
		}
	}
}
