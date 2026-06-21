import java.util.Random;
import java.util.Scanner;
public class Game_Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choice any one : \n0 for Rock\n1 for Paper\n2 for Scissor\n");
        Random random = new Random();
        int computerInput;
        int player1 = 0;
        int player2 = 0;
        for(int i = 0; i<5; i++) {
            System.out.print("Enter number 0 to 2 : ");
            int userInput = sc.nextInt();
            if(userInput < 0 || userInput > 2){
                System.out.println("Invalid input");
                i--;
                continue;
            }
            System.out.println("-----------------------");
            computerInput = random.nextInt(3);
            if (userInput == computerInput) {
                System.out.println("Round "+(i+1)+ " is Draw");
            } else if (computerInput == 0 && userInput == 1 || computerInput == 1 && userInput == 2 || computerInput == 2 && userInput == 0) {
                    System.out.println("You win this round");
                    player1++;
                } else {
                    System.out.println("Computer wins this round");
                    player2++;
                }
        }
        if(player1 > player2) {
            System.out.println("Final : You are winner");
        }else if(player1 < player2 ){
            System.out.println("Final : Computer is winner");
        }else{
            System.out.println("Game is draw");
        }
        System.out.println("Because you win : "+ player1 + " round And Computer win : "+ player2 + " round.");
        sc.close();
    }
}
