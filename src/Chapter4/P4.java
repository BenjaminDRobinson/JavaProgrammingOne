package Chapter4;

import java.util.Scanner;

/**
 * Program to calculate best bidder price.
 *
 * @author Ben Robinson
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name of first bidder:");
        String firstBidder = scan.next();
        System.out.println("Enter how many hours of work required by first bidder:");
        int firstBidderHours = scan.nextInt();
        System.out.println("Enter how much is charged per hour by first bidder:");
        double firstBidderPrice = scan.nextDouble();

        System.out.println("Enter name of second bidder:");
        String secondBidder = scan.next();
        System.out.println("Enter how many hours of work required by second bidder:");
        int secondBidderHours = scan.nextInt();
        System.out.println("Enter how much is charged per hour by first bidder:");
        double secondBidderPrice = scan.nextDouble();

        double firstBidderTotal = firstBidderHours * firstBidderPrice;
        double secondBidderTotal = secondBidderHours * secondBidderPrice;

        if (firstBidderHours > secondBidderHours) {
            System.out.printf("The winner is %s with a total cost of %.2f", firstBidder, firstBidderTotal);
        }

        if (firstBidderHours < secondBidderHours) {
            System.out.printf("The winner is %s with a total cost of %.2f", secondBidder, secondBidderTotal);
        }

        if ((firstBidderHours == secondBidderHours) && (firstBidderHours < secondBidderHours)) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", secondBidder, secondBidderTotal, firstBidderHours);
        }

        if ((firstBidderTotal == secondBidderTotal) && (firstBidderHours > secondBidderHours)) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", secondBidder, secondBidderTotal, secondBidderHours);
        }

        if ((firstBidderTotal == secondBidderTotal) && (firstBidderHours == secondBidderHours)) {
            System.out.printf("%s and %s have identical bids with %d hours and a total cost of %.2f", firstBidder, secondBidder, firstBidderHours, firstBidderTotal);
        }

    }

}
