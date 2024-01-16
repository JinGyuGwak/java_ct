package 디피;
import java.util.*;
import java.io.*;
public class Boj1904_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n+2];


        a[1]=1;
        a[2]=2;
        for(int i=3;i<=n;i++){
            a[i]=(a[i-1]+a[i-2])%15746;
        }
        System.out.println(a[n]%15746);

    }
}
