import java.util.Scanner;
/**
 * Program that reverses a text input.
 *
 * @author Ben Robinson
 */
public class C5_46 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String normalString;
        String fixedString = "";
        char currentLetter;
        int currentIndex= 1;

        System.out.print("Insert string: ");
        normalString = scan.nextLine();

        while (normalString.length() > fixedString.length())
        {
            currentLetter = normalString.charAt(normalString.length() - currentIndex);
            fixedString = fixedString + currentLetter;
            currentIndex += 1;
        }
        System.out.printf("\n\nThe String %s backwards is %s", normalString, fixedString); 
    }
}