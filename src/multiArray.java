import java.util.Scanner;
public class multiArray {
    static void TwoDarray(int[][]arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int r=sc.nextInt();
        System.out.println("enter the column");
        int c= sc.nextInt();
        int[][]arr=new int[r][c];
        System.out.println("enter "+r*c+" element in the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        TwoDarray(arr,r,c);
    }
}
