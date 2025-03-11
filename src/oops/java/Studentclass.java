package oops.java;
import java.sql.SQLOutput;
import java.util.*;

public class Studentclass {
    //creating anew data type

    public static void fun(Student x){
        System.out.println(x.name);
    }
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);
       Student x=new Student("ram",26,35.5);
        System.out.println(x.noOfStudent);
       /* x.name="Gourab";
        x.rno=28;
        x.percentage=82.5;
        System.out.println(x.name);
        System.out.println(x.rno+8);*/
        Student y=new Student("gourab",28,92.5);
        System.out.println(y.noOfStudent);
        /*y.name="rhaul";
        y.percentage=87.5;
        y.rno=78;
        Car c1=new Car();
        c1.name="alto";
        c1.price=400000;
        c1.type="hatchback";
        fun(x);
        x.setEnroll(78);
        System.out.println(x.getEnroll());*/
        System.out.println(y.name);
        System.out.println(y.rno);
        System.out.println(y.percentage);
        System.out.println(x.schoolName);
        System.out.println(y.schoolName );


    }
}
