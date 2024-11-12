import java.util.Scanner;
public class LogiOperator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
        System.out.println("enter p: ");
        int p=sc.nextInt();
        System.out.println("emter q");
        int q=sc.nextInt();
        System.out.println("enter r");
        int r= sc.nextInt();
        System.out.println("p==q andp==r");
        System.out.println( p==q && p==r);

    }
}
