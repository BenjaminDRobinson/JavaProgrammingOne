package Chapter8;
import java.util.Scanner;
/**
 * Program that stores and displays sales during a week.
 *
 * @author Ben Robinson
 */
public class P8 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ID = "Ben";
        String Day;
        char employee;
        String answer = "";
        double list[][] = new double[4][5];
        do {
            do {
                System.out.println("Enter the salesman ID as A, B, C, or D.");
                ID = scan.next().toUpperCase();
            } while (!(ID.equals("A")) && (!(ID.equals("B"))) && (!(ID.equals("C"))) && (!(ID.equals("D"))));
            do {
                System.out.println("Enter day as M, T, W, H, or F. ");
                Day = scan.next().toUpperCase();
            } while (!(Day.equals("M")) && (!(Day.equals("T"))) && (!(Day.equals("W"))) && (!(Day.equals("H"))) && (!(Day.equals("F"))));

            System.out.println("Enter the amount of sale:");
            double Sale = scan.nextDouble();

            switch (ID) {
                case "A":
                    switch (Day) {
                        case "M":
                            list[0][0] += Sale;
                            break;
                        case "T":
                            list[0][1] += Sale;
                            break;
                        case "W":
                            list[0][2] += Sale;
                            break;
                        case "H":
                            list[0][3] += Sale;
                            break;
                        case "F":
                            list[0][4] += Sale;
                            break;
                    }
                    break;
                case "B":
                    switch (Day) {
                        case "M":
                            list[1][0] += Sale;
                            break;
                        case "T":
                            list[1][1] += Sale;
                            break;
                        case "W":
                            list[1][2] += Sale;
                            break;
                        case "H":
                            list[1][3] += Sale;
                            break;
                        case "F":
                            list[1][4] += Sale;
                            break;
                    }
                    break;
                case "C":
                    switch (Day) {
                        case "M":
                            list[2][0] += Sale;
                            break;
                        case "T":
                            list[2][1] += Sale;
                            break;
                        case "W":
                            list[2][2] += Sale;
                            break;
                        case "H":
                            list[2][3] += Sale;
                            break;
                        case "F":
                            list[2][4] += Sale;
                            break;
                    }
                    break;
                case "D":
                    switch (Day) {
                        case "M":
                            list[3][0] += Sale;
                            break;
                        case "T":
                            list[3][1] += Sale;
                            break;
                        case "W":
                            list[3][2] += Sale;
                            break;
                        case "H":
                            list[3][3] += Sale;
                            break;
                        case "F":
                            list[3][4] += Sale;
                            break;
                    }
                    break;
            }
            do {
                System.out.println("More Data? Enter Y for yes, N for no.");
                answer = scan.next().toUpperCase();
            } while (!(answer.equals("Y")) && (!(answer.equals("N"))));
        } while (answer.equals("Y"));
        System.out.println("Salesman  M  T  W  H  F  ");
        employee = 'A';
        for (int row = 0; row < list.length; row++) {
            System.out.print(employee + " ");
            for (int column = 0; column < list[row].length; column++) {
                System.out.print(list[row][column] + " ");
            }
            System.out.println();
            employee++;
        }
    }
}
