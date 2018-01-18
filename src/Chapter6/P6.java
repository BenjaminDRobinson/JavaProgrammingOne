package Chapter6;
import java.util.Scanner;
/**
 * Program to convert different currencies.
 *
 * @author Ben Robinson
 */
public class P6 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String answer = "yes';
        String answer;
        double currency;
        //Asking values
        System.out.print("How many Euros does a dollar buy? ");
        double euro = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        double pound = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        double yen = input.nextDouble();
        //Asking dollars and which currency to use
        do {
            System.out.print("Enter the number of dollars you want to convert: ");
            double dollar = input.nextDouble();
            System.out.print("Enter E to buy Euros, P to buy Pounds, or Y to buy Yen: ");
            String conversion = input.next().toLowerCase();
            switch(conversion){
                //Figuring for euros
                case "e": currency = euro;
                System.out.printf("For %4.2f dollars, you can buy %.2f Euros", dollar, convert(dollar, currency));
                break;
                //Figuring for pounds
                case "p": currency = pound;
                System.out.printf("For %4.2f dollars, you can buy %.2f Pound Sterlings", dollar, convert(dollar, currency));
                break;
                //Figuring for yen
                case "y": currency = yen;
                System.out.printf("For %4.2f dollars, you can buy %.2f Yen", dollar, convert(dollar, currency));
                break;
                //If invalid answer
                //
                default: do{
            System.out.print("Enter E to buy Euros, P to buy Pounds, or Y to buy Yen: ");
            conversion = input.next().toLowerCase();
            switch(conversion){
                case "e": currency = euro;
                System.out.printf("For %4.2f dollars, you can buy %.2f Euros", dollar, convert(dollar, currency));
                break;
                case "p": currency = pound;
                System.out.printf("For %4.2f dollars, you can buy %.2f Pound Sterlings", dollar, convert(dollar, currency));
                break;
                case "y": currency = yen;
                System.out.printf("For %4.2f dollars, you can buy %.2f Yen", dollar, convert(dollar, currency));
                break;   
                }
            } while((!(conversion.equals("e"))) || (!(conversion.equals("p"))) || (!(conversion.equals("y"))));
            }
            //Asking if there are more conversions
            System.out.printf("\nAre there more conversions to perform? ");
            answer = input.next().toLowerCase();
            if (answer.equals("no"))
                System.exit(0);
            if (!(answer.equals("no")))
                if (!(answer.equals("yes")))
                    do{
                        System.out.print("Enter yes to continue or no to stop: ");
                        answer = input.next().toLowerCase();
                        if (answer.equals("no"))
                            System.exit(0);
                        if (answer.equals("yes"))
                            break;
                    } while ((!(answer.equals("no"))) || (!(answer.equals("yes"))));
        } while(answer.equals("yes"));
    }
    /**
     * Main Method
     *
     * @param dollar amount of dollars.
     * @param currency what kind of currency is being converted.
     * @return total amount of dollars.
     */
    public static double convert(double dollar, double currency){
        double tax;
        double remaining;
        double total = 0;
        //Figuring amount you get when converting
        if (dollar > 100){
            tax = dollar * 0.05;
            remaining = dollar - tax;
            total = remaining * currency;
        }
        else if (dollar <= 100){
            tax = dollar * 0.10;
            remaining = dollar - tax;
            total = remaining * currency;
        }
        return total;
    }
}