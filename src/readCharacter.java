import java.util.Scanner;
public class readCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(10);
        //string ch=sc.next()/nextLine();
        System.out.println("character is"+ch);
    }
}
