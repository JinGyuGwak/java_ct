package 디피;
import java.io.*;
import java.util.*;
public class Boj11726_S3 {
    public static void main(String[] arr) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n+1];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<n;i++){
            a[i]=(a[i-1]+a[i-2])%10007;
        }
        System.out.println(a[n-1]);
    }
}

