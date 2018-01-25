package Chapter7;
import java.util.Scanner;
/**
 * Program to calculate student letter grade.
 *
 * @author Ben Robinson
 */
public class C7_1 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting number of students and filling array
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int[] myList = new int[students];
        System.out.print("Enter " + students + " scores: ");
        for (int i = 0; i < myList.length; i++){
            myList[i] = input.nextInt();
        }
        //Getting the max, calculating grade, and output
        double max = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
        }
        for (int i = 0; i < myList.length; i++){
            double score = myList[i];
            if (score >= max - 10)
                System.out.println("Student " + i + " score is " + myList[i] + " and grade is A");
            else if (score >= max - 20)
                System.out.println("Student " + i + " score is " + myList[i] + " and grade is B");
            else if (score >= max - 30)
                System.out.println("Student " + i + " score is " + myList[i] + " and grade is C");
            else if (score >= max - 40)
                System.out.println("Student " + i + " score is " + myList[i] + " and grade is D");
            else
                System.out.println("Student " + i + " score is " + myList[i] + " and grade is F");
        }
    }
}


