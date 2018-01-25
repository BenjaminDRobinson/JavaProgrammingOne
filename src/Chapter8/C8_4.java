package Chapter8;
/**
 * Program that displays a large array.
 *
 * @author Ben Robinson
 */
public class C8_4 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int chart[][] = {
        {2, 4, 3, 4, 5, 8, 8, 34},
        {7, 3, 4, 3, 3, 4, 4, 28},
        {3, 3, 4, 3, 3, 2, 2, 20},
        {9, 3, 4, 7, 3, 4, 1, 31},
        {3, 5, 4, 3, 6, 3, 8, 32},
        {3, 4, 4, 6, 3, 4, 4, 28},
        {3, 7, 4, 8, 3, 8, 4, 37},
        {6, 3, 5, 9, 2, 7, 9, 41},
        };
        System.out.println("             Su  M   T   W  Th   F  Sa Total");
        for (int row = 0; row < chart.length; row++){
            System.out.print("Employee " + row);
            for (int column = 0; column < chart[row].length; column++){
                System.out.printf(" %3d", chart[row][column]);
            }
            System.out.println();
        }
    }
}


