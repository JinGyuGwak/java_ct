package boj_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1874_S2 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack();
        Deque<String> q = new ArrayDeque();
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int m=Integer.parseInt(br.readLine());
            a[i]=m;
        }
        int c=1;
        int next=0;
        for(int i=1;i<=a[0];i++){
            st.push(c);
            c+=1;
            q.addFirst("+");
        }
        q.addFirst("-");
        st.pop();
        next+=1;
        while(a.length != next ) {
            if (!st.isEmpty() && a[next] == st.peek()) {
                st.pop();
                next+=1;
                q.addFirst("-");
            }
            else if(!st.isEmpty() && a[next]<st.peek()){
                q.clear();
                q.addFirst("NO");
                break;
            }
            else {
                st.push(c);
                c+=1;
                q.addFirst("+");
            }
        }
        if(a.length != next) System.out.println("NO");
        else {
            while (!q.isEmpty()) {
                System.out.println(q.pollLast());
            }
        }
    }
}
