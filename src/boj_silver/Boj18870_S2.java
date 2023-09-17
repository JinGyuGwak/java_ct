package boj_silver;
import java.util.*;
import java.io.*;
public class Boj18870_S2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            a[i]=x;
            b[i]=x;
        }
        Arrays.sort(a); // -10 -9 2 4 4

        map.put(a[0],0);
        int r=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1])continue;

            map.put(a[i],r); // 9 9 9 10 10 10
            r+=1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<b.length;i++){
            sb.append(map.get(b[i]));
            if(i!=b.length-1)sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
