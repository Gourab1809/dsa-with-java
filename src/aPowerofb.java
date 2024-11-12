//fiind a to power b
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class aPowerofb {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        for(int i=0;i<=b;i++){
            ans*=a;
        }
        System.out.println("the  value of a to power b is: "+ans);
    }

}
