public class MultipleOf7and5 {
    public static void main(String[]args){
        int num=1;
        while(true){
            if(num%5==0 && num%7==0){
                System.out.println("Found the no which is is divisble by 5&7  :  "+num);
                break;
            }
            num++;
        }
    }
}
