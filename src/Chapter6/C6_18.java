package Chapter6;
import java.util.Scanner;
/**
 * Program that checks a password for certain things.
 *
 * @author Ben Robinson
 */
public class C6_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Enter your password: ");
        password = input.nextLine();
        if (checkPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
/**
     * Checking Password
     *
     * @param password is checked.
     * @return true or false whether password meets requirements.
     */
    public static boolean checkPassword(String password) {
        int counter = 0;
        // Must have at least 8 characters
        if (password.length() < 8) {
            System.out.println("A password must have at least eight characters");
            return false;
        }
        //Must consist of only letters or numbers
        for (int i = 0; i < password.length(); i++){ 
            if (!(Character.isLetterOrDigit(password.charAt(i)))){
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }
        //Must contain at least two digits
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                ++counter;
            }
        }
        if (counter < 2){
            System.out.println("A password must contain at least two digits");
            return false;
        }
        return true;
    }
    
}


