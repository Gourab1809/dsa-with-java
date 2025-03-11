import java.util.*;
public class PascaleTriangle {
    //p[i][j]=p[i-1][j-1]+p[i-1][j]
    //in every row first and last element is one
    /*
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
    */

        public static void printPascalTriangle(int n) {
            for (int i = 0; i < n; i++) {
                int num = 1;
                // Print spaces for formatting
                for (int space = 0; space < n - i - 1; space++) {
                    System.out.print("  ");
                }
                // Compute and print Pascal's Triangle values
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + "   ");
                    num = num * (i - j) / (j + 1);
                }
                System.out.println();  // Move to next row
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            scanner.close();

            printPascalTriangle(rows);
        }



}
