package oops.java;

public class Student {

        String name;
        int rno;
        private int  enroll;
        double percentage;
        static int noOfStudent;

         public int getEnroll(){//getter
                 return enroll;
         }
         final String schoolName="DAV";
         public void setEnroll(int enroll){
                this.enroll= enroll;// setter
                 //this key word

         }public Student(){

        }
         //constructor
         public Student(String n,int r,double p){
                 name=n;
                 rno=r;
                 percentage=p;
                 noOfStudent++;
         }

}
