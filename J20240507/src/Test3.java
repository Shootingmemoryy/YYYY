import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            String[] str=new String[n];
            String s1=in.next();
            String s2=in.next();
            int pvev1=-1,pvev2=-1;
            for(int i=0;i<n;i++){
                str[i]=in.next();
            }
            int length=-1;
            for(int i=0;i<n;i++){
                if(str[i].equals(s1)){
                    pvev1=i;
                    length=Math.min(length,pvev2-pvev1);
                }else if(str[i].equals(s2)){
                    pvev2=i;
                    length=Math.min(length,pvev2-pvev1);
                }
            }
            System.out.println(length);
        }
    }
}
