import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main (String[] args) {
        
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter:\n 0 for Rock, 1 for Paper, 2 for Scissor  ");
          int userInput = sc.nextInt();
          
          Random random = new Random();
          int computerInput = random.nextInt(3);
          
          if(userInput == computerInput){
              System.out.println("Draw");
          }
          else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                   || userInput == 2 && computerInput == 1){
                       System.out.println("YOU WIN!!!!");
            }
            else{
                System.out.println("COMPUTER WIN!!!!!!");
            }
            
            if(computerInput == 0){
                System.out.println("computer choice: Rock");
            }
            else if(computerInput == 1){
                System.out.println("computer choice: Paper");
            }
            else if(computerInput == 2){
                System.out.println("computer choice: Scissor");
            }
                   
    }
}
