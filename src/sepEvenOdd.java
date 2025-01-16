import java.util.Scanner;
public class sepEvenOdd {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void SortByParity(int[]arr){
        int n=arr.length;
        int left =0;
        int right =n-1;
        while(left<right){
            if (arr[left]%2==1&&arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element ");
        int n=sc.nextInt();
        System.out.println("enter the element of the array");
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        System.out.println("after applying parity");
        SortByParity(arr);
        printArray(arr);
    }
}
