package Chapter5;
import java.util.Scanner;
/**
 * Program that can count votes.
 *
 * @author Ben Robinson
 */
public class P5 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) 
    {
        long yesVote = 0;
        long noVote = 0;
        char userInput;
        boolean keepVoting = true;
        Scanner scan = new Scanner(System.in);

        while(keepVoting == true)
        {
            System.out.println("\nInsert vote: Y or y for yes, N or n for no, Q or q to quit. ");
            userInput = scan.next().charAt(0);

            userInput = Character.toUpperCase(userInput);
 
            switch (userInput) {
                case 'Y':
                    yesVote += 1;
                    break;
                case 'N':
                    noVote += 1;
                    break;
                case 'Q':
                    keepVoting = false;
                    break;
                default:
                    System.out.print("Input invalid.");
                    break;
            }
        }

        System.out.print("\n\nVote totals:");
        System.out.print("\n   Yes votes: "+ yesVote);
        System.out.print("\n   No votes: "+ noVote);

        if (yesVote > noVote)
        {
            System.out.print("\n Yes has more votes.");
        }
        else if (yesVote < noVote)
        {
            System.out.print("\n No has more votes.");
        }
        else
        {
            System.out.print("\n Yes and No have identical votes.");
        }
    }
}

