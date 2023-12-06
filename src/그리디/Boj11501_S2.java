package 그리디;
import java.util.*;
import java.io.*;
public class Boj11501_S2 {
    static int n;
    static int[] a;
    static long[] dap;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dap = new long[T];
        for(int i=0; i<T;i++){
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = new int[n];
            for(int j=0; j<n;j++){
                a[j]=Integer.parseInt(st.nextToken());
            }
            sol(i);
        }
        for(int i=0;i<T;i++){
            System.out.println(dap[i]);
        }
    }
    public static void sol(int index){
        int max=Integer.MIN_VALUE;
        long hap=0;
        for(int i=n-1; i>=0; i--){
            if(max<a[i]) max=a[i];
            else hap+=max-a[i];
        }
        dap[index]=hap;
    }
}
