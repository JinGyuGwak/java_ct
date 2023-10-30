package boj_silver;
import java.util.*;
import java.io.*;

public class Boj14501_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        int[] r = new int[n+1];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0]=Integer.parseInt(st.nextToken());
            a[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            if(i+a[i][0]<=n) {
                r[i + a[i][0]] = Math.max(r[i + a[i][0]],r[i]+a[i][1]);
            }
            r[i+1]=Math.max(r[i+1],r[i]);
        }
        System.out.println(r[n]);
    }
}

