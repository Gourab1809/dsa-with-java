import java.util.Scanner;
public class RotateArray {
    static int []rotateArray(int[]arr,int k){
        int n=arr.length;
        int []ans=new int[n];
        int j=0;
        if(k<n){
            for(int i=k;i<n;i++){
                ans[j]=arr[i];
                j++;
            }
            for(int i=0;i<k;i++){
                ans[j]=arr[i];
                j++;
            }
        }
        else{
            k=k%n;
            for(int i=n-k;i<n;i++){
                ans[j]=arr[i];
                j++;
            }
            for(int i=0;i<n-k;i++){
                ans[j]=arr[i];
                j++;
            }
        }

        return ans;
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        int []arr1=rotateArray(arr,k);
        System.out.println("the array after rotation is ");
        printArray(arr1);
    }
}
