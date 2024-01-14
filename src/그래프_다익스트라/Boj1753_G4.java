package 그래프_다익스트라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1753_G4 {

    /**
     * 다익스트라 문제임 시발
     */
    static int v ;
    static int e;
    static int k; // 기준 배열
    static int[][] a;
    static int[] dap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v=Integer.parseInt(st.nextToken());
        e=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(br.readLine());
        a=new int[v+1][v+1];
        dap=new int[v+1];
        Arrays.fill(dap,Integer.MAX_VALUE);
        dap[k]=0;
        for(int i=0;i<e;i++){
            st = new StringTokenizer(br.readLine());
            int x =Integer.parseInt(st.nextToken());
            int y =Integer.parseInt(st.nextToken());
            int z =Integer.parseInt(st.nextToken());
            a[x][y]=z;
        }


    }
}
