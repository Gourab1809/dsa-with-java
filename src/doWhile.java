//sum of n natural no using do while no
import java.util.Scanner;
public class doWhile {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        do{
            sum+=num;
            num=num-1;

        }while(num!=-1);
        System.out.println(sum);
    }
}
