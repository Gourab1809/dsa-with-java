import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(n<=3){
                System.out.println(i+" the no is prime");
            }
            else if(n%i==0){
                System.out.println(i+"not perime");
            }
            else{
                System.out.println(i+" the no is prime");
            }
        }
    }
}
