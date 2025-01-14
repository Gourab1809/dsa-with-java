import java.util.Scanner;
public class RotateInPlace {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[]arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateINplace(int[]arr,int k){
        int n=arr.length;

        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);





    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the element of the array are : ");
        printArray(arr);
        System.out.println("enter the index from where you want to rotate array");
        int k=sc.nextInt();
        rotateINplace(arr,k);
        System.out.println(" the element after rotation");
        printArray(arr);

    }
}
