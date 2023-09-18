package boj_gold;

import java.util.*;
import java.io.*;
public class Boj11000_G5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            a[i][0]=x;
            a[i][1]=y;
        }
        Arrays.sort(a,(o1,o2) -> {return o1[0]-o2[0];});
        q.add(a[0][1]);
        int c=1;
        for(int i=1;i<n;i++){
            if(q.peek()>a[i][0]){ // 강의실 추가해야 하는 경우
                c+=1;
                q.add(a[i][1]);
            }
            else {
                q.poll();
                q.add(a[i][1]);
            }
        }
        System.out.println(c);
    }
}
