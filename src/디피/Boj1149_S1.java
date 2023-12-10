package 디피;
import java.io.*;
import java.util.*;
public class Boj1149_S1 {
    static int[][] a ;
    static int n;
    static int dap=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a=new int[n][3];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        sol();
        System.out.println(dap);
        /**
         *  1 3 4
         *  2 3 5
         *  9 1 8
         *
         *  1 3 4
         *  5 4 6
         *  13 6 12
         *
         *
         */
    }
    public static void sol(){
        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++){ // 0 1 2 , (+1 +2) % 2
                a[i][j]+=Math.min(a[i-1][(j+1)%3],a[i-1][(j+2)%3]);
            }
        }
        for(int i=0;i<3;i++){
            dap=Math.min(dap,a[n-1][i]);
        }
    }
}
