import java.util.Scanner;
public class countDigit {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        System.out.println("the no of digit in the number is : "+count);
    }
}
