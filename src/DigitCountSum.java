import java.util.Scanner;
public class DigitCountSum {
    static void CountDigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("the no of digit is "+count);
    }
    static void SumDigit(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n=n/10;
        }
        System.out.println("the sum of digit is "+sum);
    }
    static void Reversedigit(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+(n%10);
            n/=10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        CountDigit(n);
        SumDigit(n);
        Reversedigit(n);
    }
}
