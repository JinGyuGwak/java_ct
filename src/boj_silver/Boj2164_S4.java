package boj_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2164_S4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque();

        for(int i=1;i<=n;i++){
            q.addFirst(i);
        }
        while(q.size()>=2){
            q.pollLast();
            q.addFirst(q.pollLast());
        }
        System.out.println(q.poll());


    }

}
