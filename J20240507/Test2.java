import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int []cost=new int[n];
            int []dp=new int[n+1];
            for(int i=0;i<n;i++){
                cost[i]=sc.nextInt();
            }
            for(int i=2;i<=n;i++){
                dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
            }
            System.out.println(dp[n]);
        }
    }
}
