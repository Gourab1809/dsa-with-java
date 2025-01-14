import java.util.Scanner;
public class arrayExample {
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int countOcurrance(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    static int lastOccurance(int []arr,int x){
        int Lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                Lastindex=i;
            }
        }
        return Lastindex;
    }
    static boolean isSorted(int []arr){
        boolean check=true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
    static int pairSum(int []arr,int target){
        int ans=0;
        for(int i= 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletPairSum(int []arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    static void findUnique(int[]arr){
        int n=arr.length;
        int ans=0;
        System.out.println("the unique element are ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans=arr[i];
                System.out.print(ans+" ");
            }
        }

    }
    static int findMax(int[]arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int[]arr){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int SecondMax=findMax(arr);
        return SecondMax;
    }
    static void resverseArray(int[]arr){
        int n=arr.length;
        int[]ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        System.out.println(" the reverse element are: ");
        for(int k=0;k<n;k++){
            System.out.print(ans[k]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the emlment of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" the element are: ");
        printArray(arr);
        System.out.println();
        resverseArray(arr);
        System.out.println();
        System.out.println("enter the element which you wnt to count present in your array: ");
        int a=sc.nextInt();
        int count=countOcurrance(arr,a);
        System.out.println("the no "+a+" element present in the array is :"+count);
        System.out.println("the last index of the no that occur is : "+lastOccurance(arr,a));
        System.out.println("the array is sorted : "+isSorted(arr));
        System.out.println("enter the target sum");
        int target=sc.nextInt();
        System.out.println("the no pair equal to the target sum is : "+pairSum(arr,target));
        System.out.println("the no triplet pair equal to the target sum: "+tripletPairSum(arr,target));
        findUnique(arr);
        System.out.println("the second max element of the array is : "+findSecondMax(arr));
    }
}
