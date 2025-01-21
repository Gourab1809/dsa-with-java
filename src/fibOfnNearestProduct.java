/* CAPGEMINI CODING QUESTIONS
Nearest Digits and Fibonacci Sum
 You are given an integer N. Perform the following steps:
 1. Find the two nearest digits to N.
 2. Calculate the product of these two digits.
 3. Generate the Fibonacci sequence up to the number of terms equal to the product
 obtained in step 2.
 4. Find the sum of the Fibonacci sequence generated.
 Input:
 ● Asingle integer N.
 Output:
 ● Asingle integer representing the sum of the Fibonacci sequence*/
import java.util.Scanner;
public class fibOfnNearestProduct {
    static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    static void product(int n){
        int a= (n-1)*(n+1);
        int sum=0;
        for(int i=0;i<a;i++){

            sum+=fib(i);

        }
        System.out.println("fibonachi sum of the product of thr nearest number is:"+sum);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer");
        int n=sc.nextInt();
        product(n);

    }

}
