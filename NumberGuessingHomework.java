package numberguessinghomework;
import java.util.Scanner;
public class NumberGuessingHomework {
    public static void main(String[] args) {
        System.out.printf("This is a number guessing game.\nHere are the rules : \n");
        System.out.printf("1. Enter only an integer at a time.\n"
                + "2. The number has to be in the range. \n  (The first guess should be in the range of 0 to 99.)\n"
                + "3. The input number will narrow the range down.\n"
                + "4. If there is only one integer left, you lose the game\n"
                + "5. Input 5487 to quit game.\n");
        int ans = (int) (Math.random() * 100);
            // ans is the correct answer that the generated randomly
            // System.out.println(ans);
        int min = 0;
        int max = 99;
        int count = 0;
        while(true){       
            Scanner input = new Scanner (System.in);	        
            double wrongnum = input.nextDouble();
            // wrongnum is the double(incorrect) format of the number player guessed        
            if (wrongnum == (int)wrongnum){           
                int num = (int)wrongnum;
            // num is the correct format format of the number player guessed
                if (num == 5487){
                    return;
                }
                if ((num <= max) && (num >= min)){                               
                    if (num < ans){
                        min = num+1;
                        count++;
                    }
                    if (num > ans){
                        max = num-1;
                        count++;
                    }
                    if (num == ans){
                        System.out.println("You won the game.");
                        if (count == 0){
                            System.out.println("You guessed "+(count+1)+" time.");
                        }
                        if (count != 0){
                            System.out.println("You guessed "+(count+1)+" times.");
                        }
                        break;
                    }    
                    if (max - min == 0){
                        System.out.println("You lost the game.\nThe answer is "+ans+ ".");
                        break;
                    }
                    System.out.println("The range is from "+(min)+" to "+(max));
                    System.out.println("Please do your next guess.");
                }
                else {
                    System.out.println("You can only enter a number from " +min+ " to " +max+ " . "); 
                    System.out.println("Please redo the input. "); 
                } 
            }
            else if (wrongnum != (int)wrongnum){
                System.out.println("You can enter only integer.");
                System.out.println("Please redo the input.");
            }
        } 
    }       
}
