import java.util.Scanner;
public class dgreeBtwHrAndMin {
    static  double DgreeBtwHrAndMin(int h,int m){
        double y=m*6;//minute angle
        double z=(h*30)+(m*0.5);//hour angle
        double a=Math.abs(z-y);//angle

        return Math.min(a,360-a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hour ");
        int h=sc.nextInt();
        System.out.println("enter the min");
        int m=sc.nextInt();
        //DgreeBtwHrAndMin(h,m);
        System.out.println(DgreeBtwHrAndMin(h,m));
    }
}
