package boj_silver;

import java.util.*;
import java.io.*;

public class Boj1931_S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int tt = Integer.parseInt(st.nextToken());
            a[i] = new int[]{t, tt};
        }
        Arrays.sort(a,new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[1]==o2[1]) return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });
        int dap=0;
        int endTime =0;
        for(int i=0;i<n;i++){
            if(endTime<=a[i][0]){
                endTime=a[i][1];
                dap+=1;
            }
        }
        System.out.println(dap);


    }
}
