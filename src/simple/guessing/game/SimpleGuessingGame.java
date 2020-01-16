
package simple.guessing.game;

import java.util.Random;
import java.util.Scanner;

public class SimpleGuessingGame {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        int decider;
        int objectChooser;
        String userChosenBox;
        String[] computerChosenBox = {"A", "B"};
        String [] object = {"brand new iPhone", "golden purse", "$200,000 cheque"};
        
        while(true)//Infinite loop
        {
            decider = random.nextInt(2);
            objectChooser = random.nextInt(3);
            
            System.out.println("Score: " + score);
            System.out.println("\nThere are two boxes (A and B) and ");
            System.out.println("I have hidden a " + object[objectChooser] + " in one of them");
            System.out.println("Guess the box!");
            System.out.println("A or B?");
            
            userChosenBox = (input.nextLine()).toUpperCase();
            if (userChosenBox.equals(computerChosenBox[decider])){
                score++;
                System.out.println("You are right!");
                System.out.println("I kept the " +object[objectChooser] + " in box " + computerChosenBox[decider]);
                System.out.println();
            }
            else{
                System.out.println("Ooops");
                System.out.println("I kept the " +object[objectChooser] + " in box " + computerChosenBox[decider]);
                System.out.println();
            }
            
        }
        
    }
    
}
