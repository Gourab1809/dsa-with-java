import java.util.Scanner;
public class TransposeOfMatrix {
    static void printMatrix(int[][]arr,int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] transpose(int[][]arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
        //printMatrix(arr,r,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int r = sc.nextInt();
        System.out.println("enter the column");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter " + r * c + " element in the array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is");
        printMatrix(arr,r,c);
        System.out.println("the transpose of matrix is");
        int [][]arr1=transpose(arr,r,c);
        printMatrix(arr1,r,c);
    }

}
