package boj_silver;

import java.util.*;
import java.io.*;
public class Boj2075_S2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                q.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i=0; i<n-1;i++){
            q.poll();
        }
        System.out.print(q.poll());
    }
}
