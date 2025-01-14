import java.util.Scanner;
public class secInClock {
    static void SecInClock(int n){
        int y=n%60;//second
        int x=n/60;
        int z=x%60;//min
        int h=x/60;//hrs
        System.out.println("the "+n+"in clock form is"+h+":"+z+":"+y);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" the seconds");
        int n=sc.nextInt();
        SecInClock(n);
    }
}
