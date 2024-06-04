import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            double n=in.nextDouble();
            String str=in.next();
            double sum=0;
           n= (int) Math.ceil(n);
            if(n>1){
                sum=sum+n-1.0;
            }
            sum+=20;
        if(str.equals("y")){
            sum=sum+5;
        }
        System.out.println((int)sum);
        }
    }
}
