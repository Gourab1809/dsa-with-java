import java.util.*;
public class ReverseMatrix {
    static void printmatrix(int[][]arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    static  void transposeInPlace(int[][]arr,int r,int c){
        for(int i=0; i<c;i++){
            for(int j=i+1;j<r;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }
    static void reverseArray(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][]matrix,int n){
        transposeInPlace(matrix,n,n);
        //reverse each row
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        //take input(r=c)
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[][]matrix=new int[n][n];
        System.out.println("enter "+n*n+" no of element in the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printmatrix(matrix,n);
        rotate(matrix,n);
        System.out.println("rotation matrix");
        printmatrix(matrix,n);
    }
}
