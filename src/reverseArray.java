import java.util.Scanner;
public class reverseArray {
    static void printArray(int[]arr){
        //System.out.println("the element of array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapInArray(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void ReverseArray(int[]arr){
        int i=0;int j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the no element : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println(" enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the element of the array is : ");
        printArray(arr);
        System.out.println("the reverse of array is : ");
        ReverseArray(arr);
        printArray(arr);

    }
}
