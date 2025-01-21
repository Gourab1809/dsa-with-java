import java.util.Scanner;
public class PrefixInPlace {
    static int[]prefixInPlace(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        System.out.println("after prefix aum array is");
        prefixInPlace(arr);
        printArray(arr);
    }
}
