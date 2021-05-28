/* java program to create Rock, Paper, Scissor Game using conditional operator
our aim :
1. We need to accept the move from the Player to select Rock , Paper , Scissor from the keyboard
2. We need to going to the computer to select the random Rock , Paper , Scissor to play against to the player
3. Compare both moves
4. Declare who is win...
 */

package com.company;
import java.util.Scanner;
import java.util.Random;
public class RPS_GAME {
    public static void main (String[]args)
    {
      Scanner sc = new Scanner(System.in);
      while(true)
      {
        String [] rps = {"r","p","s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;
        while(true){
           System.out.println("Please! Enter your move (r,p,s)");
           playerMove = sc.nextLine();
           if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))  //logical OR operator
           {
               break;
           }

           System.out.println(playerMove + "is not valid move please try again!");
        }
          System.out.println(" Computer played: " + computerMove );
          if(playerMove.equals(computerMove)){
              System.out.println("The game was a tie!");
          }
          else if(playerMove.equals("r")) {
              if (computerMove.equals("p")) {
                  System.out.println("You Lose!");
              } else if (computerMove.equals("s")) {
                  System.out.println("You Win!");
              }
          }
          else if(playerMove.equals("p")) {
              if (computerMove.equals("r")) {
                  System.out.println("You Win!");
              } else if (computerMove.equals("s")) {
                  System.out.println("You Lose!");
              }
          }
          else if(playerMove.equals("s")) {
              if (computerMove.equals("p")) {
                  System.out.println("You Win!");
              } else if (computerMove.equals("r")) {
                  System.out.println("You Lose!");
              }
          }
          System.out.println("Play Again? (y/n)");
          String playAgain = sc.nextLine();

          if(!playAgain.equals("y")){
              System.out.println("I hope you had enjoyed it");
              break;
          }
      }
      sc.close();

    }
}