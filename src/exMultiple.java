import java.util.Scanner;
public class exMultiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=0;i<=50;i++){
            if(i%n==0){
                continue;
            }
            System.out.print(i);
        }
    }
}
