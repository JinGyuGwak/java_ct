package 디피;

import java.io.*;
import java.util.*;
public class Boj1010_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sol(n,m); // 13 29
        }
    }
    public static void sol(int r, int n){
        //n이 중심인 수라고 생각
        int result=1;
        for(int i=0;i<r;i++){
            result = result*(n-i)/(i+1);
        }
        System.out.println(result);
    }
}
