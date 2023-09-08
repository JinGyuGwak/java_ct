package boj_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;

public class Boj10828_S4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque q = new LinkedList();

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            if (a.startsWith("push")) {
                int result = Integer.parseInt(a.substring(5));
                q.add(result);
            }
            else if(a.startsWith("top")){
                if(q.isEmpty()) System.out.println(-1);
                else System.out.println(q.peekLast());
            }
            else if(a.startsWith("size")){
                System.out.println(q.size());

            }
            else if(a.startsWith("empty")){
                System.out.println( q.isEmpty() ? 1 : 0);

            }
            else if(a.startsWith("pop")){
                System.out.println(!q.isEmpty() ? q.pollLast() : -1);

            }
        }
    }
}
