import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int a=sc.nextInt();
        if(a<12){
            System.out.println("child");
        } else if (a>12&&a<18) {
            System.out.println("tenager");
        }else{
            System.out.println("adult");
        }
    }

}
