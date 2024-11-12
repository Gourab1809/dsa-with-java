import java.util.Scanner;
public class SumOfdigit {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum Of digit is : "+sum);
    }
}
