package Chapter7;
import java.util.Scanner;
/**
 * Program to store, display, and average an array.
 *
 * @author Ben Robinson
 */
public class P7 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many numbers will be input.");
        int amount = scan.nextInt();
        double[] list = new double[amount];
        array(list, scan);
        System.out.println("Average: " + average(list));
        displayArray(list);

    }

    public static void displayArray(double[] list) {
        System.out.println("The contents of the array are: ");
        System.out.println(java.util.Arrays.toString(list));

    }

    public static void array(double[] list, Scanner input) {
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }

    public static double average(double[] list) {
        double sum = 0;
        for (int x = 0; x < list.length; x++) {
            sum += list[x];
        }
        return (sum / list.length);
    }
}
