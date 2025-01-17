import java.util.Scanner;
public class SortSquares {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[]sortSquares(int[]arr){
        int n=arr.length;
        int left=0,right=n-1;
        int[]ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        System.out.println("enter the element of array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        int []a=sortSquares(arr);
        System.out.println("square sorting of array in decreasing order");
        printArray(a);

    }
}
