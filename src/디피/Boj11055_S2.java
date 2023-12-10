package 디피;
import java.io.*;
import java.util.*;
public class Boj11055_S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        dp[0]=a[0];
        int dap=0;
        if(n==1){
            System.out.println(dp[0]);
            return;
        }
        for(int i=0;i<n;i++){
            int t=0;
            for(int j=0;j<=i;j++){
                if(a[i]>a[j]){
                    t=Math.max(t,dp[j]);
                }
            }
            dp[i]=a[i]+t;
            dap=Math.max(dap,dp[i]);
        }
        System.out.println(dap);

    }
}
