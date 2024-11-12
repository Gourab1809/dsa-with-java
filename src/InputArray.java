import java.util.Scanner;
public class InputArray {
    static int sum(int n,int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the element in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
        int sum=sum(n,arr);
        System.out.println("the sum of element of array is"+sum);
    }
}
