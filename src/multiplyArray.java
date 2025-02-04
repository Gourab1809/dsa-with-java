import java.util.Scanner;
public class multiplyArray {
    static void printMatrix(int[][]arr,int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void multiply(int [][]a,int r1,int c1,int[][]b,int r2,int c2){
        if(c1!=r2){
            System.out.println("invalid");
            return;
        }
        int[][]mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println(" the matrix after multiplication of a and b is");
        printMatrix(mul,r1,c2);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of r1");
        int r1=sc.nextInt();
        System.out.println("enter the value of c1");
        int c1=sc.nextInt();
        System.out.println("enter "+r1*c1+" element of matrix a");
        int[][]a=new int[r1][c1];
        for(int i =0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the value of r2");
        int r2=sc.nextInt();
        System.out.println("enter the value of c2");
        int c2=sc.nextInt();
        System.out.println("enter "+r2*c2+" element of matrix b");
        int[][]b=new int[r2][c2];
        for(int i =0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("the two matrix are");
        printMatrix(a,r1,c1);
        System.out.println();
        printMatrix(b,r2,c2);
        multiply(a,r1,c1,b,r2,c2);
    }
}
