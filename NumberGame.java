import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new  Scanner(System.in);
        int number =random.nextInt(100)+1;
        int guess;
        int attempts = 0;
        do{
            System.out.println("Enter Your Guess: ");
            guess = sc.nextInt();
            attempts ++;
            if(guess > number){
                System.out.println("your guess is  too high");
            }else if(guess < number){
                System.out.println("  you guess is too Low");
}
else{
System.out.println("your guess is  correct");      
   System.out.println("you guess the  correct numbers in attempts are: "+ attempts);
}
        }while(guess != number);
       sc.close();    }
    }
    