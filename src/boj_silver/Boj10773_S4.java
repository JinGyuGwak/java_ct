package boj_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj10773_S4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque();

        Stack st = new Stack();

        for(int i=0; i<n;i++){
            int m =Integer.parseInt(br.readLine());
            if(m!=0){
                q.addLast(m);
            }
            else {
                q.pollLast();
            }
        }
        int sum=0;
        while(!q.isEmpty()){
            sum+=q.poll();
        }
        System.out.println(sum);
    }
}
