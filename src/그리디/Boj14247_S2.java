package 그리디;
import java.io.*;
import java.util.*;
public class Boj14247_S2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result=0;
        int[] grow=new int[n];
        for(int i=0;i<n;i++){
            result+=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            grow[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(grow); // 1 2 3 4 7
        for(int i=1;i<n;i++){
            result+=grow[i]*i;
        }
        System.out.println(result);

    }
}
