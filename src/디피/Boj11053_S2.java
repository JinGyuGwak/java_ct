package 디피;
import java.io.*;
import java.util.*;
public class Boj11053_S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            dp[i]=1;
        }
        int c = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){ // 10 20 10 30 20 50
                if(a[i]>a[j]) dp[i]=Math.max(dp[i],dp[j]+1);
            }
            c=Math.max(c,dp[i]);
        }
        System.out.println(c);
    }
}
