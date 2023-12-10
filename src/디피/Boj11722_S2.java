package 디피;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11722_S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        if(n==0){
            System.out.println(1);
            return;
        }
        dp[0]=1;
        int count=0;
        int dap=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<=i;j++){
                if(a[i]<a[j]){
                    dap=Math.max(dap,dp[j]);
                }
            }
            dp[i]=dap+1;
            count=Math.max(dp[i],count);
        }
        System.out.println(count);
    }
}
