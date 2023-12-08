package 디피;
import java.io.*;
import java.util.*;
public class Boj1003_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] a=new int[41];
        int[] b=new int[41];
        a[0]=1; a[1]=0;
        b[0]=0; b[1]=1;

        for(int i=2;i<=40;i++){
            a[i]=a[i-1]+a[i-2];
            b[i]=b[i-1]+b[i-2];
        }
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(a[n] + " " + b[n]);

        }

    }
}
