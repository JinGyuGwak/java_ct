package 디피;
import java.io.*;
import java.util.*;
public class Boj17626_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1 ; j*j<=i ; j++){
                min=Math.min(min, dp[i - j * j]);
            }
            dp[i]=min+1;
        }
        //
        System.out.println(dp[n]);
    }
}
