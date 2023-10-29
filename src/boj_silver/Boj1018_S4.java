package boj_silver;
import java.io.*;
import java.util.*;
public class Boj1018_S4 {
    static int[][] a;
    static int min = 64;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        a = new int[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String test = st.nextToken();
            for(int j=0;j<test.length();j++){
                char ch = test.charAt(j);
                if(ch=='B')a[i][j]=1;
                else a[i][j]=0;
            }
        }
        List<Integer> dap = new ArrayList<>();
        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                solve(i,j);
            }
        }
        System.out.println(min);


    }
    public static void solve(int q1, int q2){
        int re=0;
        int t=a[q1][q2];
        for(int i=q1;i<q1+8;i++){
            for(int j=q2;j<q2+8;j++){
                if(a[i][j]!=t){
                    re+=1;
                }
                if(t==0)t=1;
                else t=0;
            }
            if(t==0)t=1;
            else t=0;
        }
        min = Math.min(min,Math.min(re,64-re));
    }
}
