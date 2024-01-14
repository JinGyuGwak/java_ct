package 디피;
import java.util.*;
import java.io.*;
public class Boj1912_S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a= new int[n+1];
        int[] dap = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        dap[0]=a[0];
        int ma = dap[0];
        for(int i=1;i<n;i++){
            if(dap[i-1]>0){
                dap[i]=dap[i-1]+a[i];
            } else {
                dap[i]=a[i];
            }
            ma = Integer.max(ma,dap[i]);
        }
        System.out.println(ma);

    }
}
