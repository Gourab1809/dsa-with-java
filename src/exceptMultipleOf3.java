public class exceptMultipleOf3 {
    public static void main(String[] args) {
        for(int num=1;num<=50;num++){
            if(num%3==0){
                continue;
            }
            System.out.print(num +" ");
        }
    }
}
