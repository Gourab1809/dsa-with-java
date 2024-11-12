//the first multiple of two no given by the user
import java.util.Scanner;
public class MultipleOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no");
        int n=sc.nextInt();
        System.out.println("enter the second number ");
        int m=sc.nextInt();
        int a=1;
        while(true){
            if(a%n==0&&a%m==0){
                System.out.println("the number is: "+a);
                break;
            }
            a++;
        }
    }
}
