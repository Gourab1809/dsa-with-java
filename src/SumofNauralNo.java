import java.util.Scanner;
public class SumofNauralNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.print(i);

        }
        System.out.println("");

        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
