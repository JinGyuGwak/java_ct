package 디피;
import java.io.*;
import java.util.*;
public class Boj2579_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[301];
        int[] dp = new int[301];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        //n번째 계단에 오는 경우의 수 n-3,n-1,n을 오는경우와 n-2,n으로 오는 경우
        dp[0]=a[0];
        dp[1]=a[1]+a[0];
        dp[2]=Math.max(a[0],a[1])+a[2];
        for(int i=3;i<n;i++){
            dp[i]=Math.max(a[i-1]+dp[i-3],dp[i-2])+a[i];
        }
        System.out.println(Arrays.toString(dp));

    }
}

