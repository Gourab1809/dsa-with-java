import java .util.Scanner;
public class BitWise {
    static int toggle(int n){
        int temp=1;// it willchange to binary form with the help of bitwise operator
        while(temp<=n){
            n=n^temp;//exclusive or is use to make 0 to 1
            temp=temp<<1;//left shift is use 0001 to 0010 to0100 to 1000
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("the the number which you want to toggle: ");
        int n=sc.nextInt();
        int toggle=toggle(n);
        System.out.println("after toggling the number is "+ toggle);
    }
}
