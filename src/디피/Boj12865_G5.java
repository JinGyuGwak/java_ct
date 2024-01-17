package 디피;
import java.io.*;
import java.util.*;
public class Boj12865_G5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n+1][m + 1];
        int[] w = new int[n+1];
        int[] v = new int[n+1];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            w[i]=Integer.parseInt(st.nextToken());
            v[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){//j는 현재 무게임

                dp[i][j]=dp[i-1][j];
                if(j-w[i] >= 0){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-w[i]]+v[i]);

                }
            }
        }
        System.out.println(dp[n][m]);

    }
}
