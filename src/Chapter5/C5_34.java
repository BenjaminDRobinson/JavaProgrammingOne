/**
 * Program that will play Rock, Paper, Scissors.
 *
 * @author Ben Robinson
 */
import java.util.Scanner;
public class C5_34 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int computerChoice;
        int playerChoice;
        int computerWins = 0;
        int playerWins = 0;

       //Starting Game
        while (computerWins <= 1 && playerWins <= 1)
        {
            System.out.print("\n\nRock (1), Paper (2), or Scissors (3): ");
            playerChoice = scan.nextInt();
            computerChoice = (int) (Math.random() * 3);
            computerChoice += 1;

            if (playerChoice >= 4)
            {
                System.out.println("\nInsert Acceptable Choice");
                continue;
            }

            switch (playerChoice)
            {
                case 1:
                    switch (computerChoice)
                    {
                case 1:
                            System.out.print("Tie");
                            break;
                        case 2:
                            System.out.print("computer Wins!");
                            computerWins += 1;
                            break;
                        case 3:
                            System.out.print("Player Wins!");
                            playerWins += 1;
                            break;
                    }
                    break;
                case 2:
                    switch (computerChoice)
                    {
                        case 1:
                            System.out.print("Player Wins!");
                            playerWins += 1;
                            break;
                        case 2:
                            System.out.print("Tie");
                            break;
                        case 3:
                            System.out.print("Computer Wins!");
                            computerWins += 1;
                            break;
                    }
                    break;
                case 3:
                    switch (computerChoice)
                    {
                        case 1:
                            System.out.print("Computer Wins!");
                            computerWins += 1;
                            break;
                case 2:
                            System.out.print("Player Wins!");
                            playerWins += 1;
                            break;
                        case 3:
                            System.out.print("Tie");
                            break;
                    }
                    break;
            }
        }

        if (computerWins > playerWins)
        {
            System.out.println("Computer wins 2/3!");
        }
        else if (playerWins > computerWins)
        {
            System.out.println("Player wins 2/3!");
        }
    }
}


