package 디피;
import java.io.*;
import java.util.*;
public class Boj10844_S1 {
    final static long mod = 1000000000;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        long[][] dp = new long[n+1][10];

        for(int i=1;i<10;i++){
            dp[1][i]=1;
        }
        for(int i=2;i<=n;i++){
            for(int j=0; j<10;j++){
                if (j == 0) {
                    dp[i][j]=dp[i-1][1] % mod;
                }
                else if(j==9){
                    dp[i][j]=dp[i-1][8] % mod;
                }
                else {
                    dp[i][j]=(dp[i-1][j-1]%mod+dp[i-1][j+1]%mod);
                }
            }
        }
        long sum=0;
        for(int i=0;i<=9;i++){
            sum+=(dp[n][i]);
        }
        System.out.println(sum%mod);
    }
}
