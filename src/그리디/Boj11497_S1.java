package 그리디;
import java.io.*;
import java.util.*;
public class Boj11497_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0 ;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            int[] a = new int[m];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                a[j]=Integer.parseInt(st.nextToken());
            }
            sol(a);



        }
    }
    public static void sol(int[] l){
        Arrays.sort(l); //1 4 7 8 9
        int[] dap = new int[l.length];
        int c=0;
        boolean sw=true;
        for(int i=0;i<l.length;i++){
            if(sw) {
                dap[c] = l[i];
                sw = false;
            } else {
                dap[l.length - 1 - c] = l[i];
                c += 1;
                sw = true;
            }
        }
        int max = Math.max(Math.abs(dap[0]-dap[1]),Math.abs(dap[l.length-1]-dap[0]));
        for(int i=1;i<dap.length-1;i++){ //1 7 9 8 4
            max=Math.max(max,Math.max(Math.abs(dap[i]-dap[i+1]),Math.abs(dap[i]-dap[i-1])));
        }
        System.out.println(max);


    }
}
