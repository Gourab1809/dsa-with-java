import java.util.Scanner;
public class sumInRange {
    static int[]prefSum(int[]arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number odf element :");
        int n=sc.nextInt();
        System.out.println("enter tbhe element of the array" );
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []prefSum=prefSum(arr);
        System.out.println("enter the queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("enter the range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            if (l >= 1 && r < arr.length) {
                int ans = prefSum[r] - prefSum[l - 1];
                System.out.println(ans);
            }
            if(l==0){
                int ans = prefSum[r];
                System.out.println(ans);
            }else{
                System.out.println("out of bound");
            }
        }
    }

}



