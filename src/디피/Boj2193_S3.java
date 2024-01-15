package 디피;
import java.io.*;
import java.util.*;
public class Boj2193_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        System.out.println(Arrays.toString(dp));
    }
}
