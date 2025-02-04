import java.util.Scanner;
public class PartitionArrayInEqualSum {
    static int arrSum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        return sum;
    }
    static boolean equalSumPart(int[]arr){
        int sum=arrSum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffSum=sum-prefSum;
            if(suffSum==prefSum)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of  element ");
        int n=sc.nextInt();
        System.out.println("enter the element in array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean m=equalSumPart(arr);
        System.out.println(m);
    }
}
