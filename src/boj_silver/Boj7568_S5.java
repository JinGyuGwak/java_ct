package boj_silver;

import java.util.*;
import java.io.*;
public class Boj7568_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Map<Integer,Integer>> array = new ArrayList<>();
        int n =Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0]=Integer.parseInt(st.nextToken());
            a[i][1]=Integer.parseInt(st.nextToken());

        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(a[i][0]<a[j][0] && a[i][1]<a[j][1]) count+=1;
                }
            }
            System.out.print(count);
            if(i!=n-1)System.out.print(" ");

        }




    }
}
