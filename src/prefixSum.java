import java.util.Scanner;
public class prefixSum {
    static int[]PrefixSum(int[]arr){
        int[]pref=new int[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        System.out.println("enter the element");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        int[]a=PrefixSum(arr);
        printArray(a);

    }
}
