//find the sum of series s=1-2+3-4....n
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans-=i;
            }
            else{
                ans+=i;
            }

        }
        System.out.println(ans);
    }
}
