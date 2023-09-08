package boj_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj9012_S4 {

    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int ch;
        for(int i=0;i<n;i++){
            ch=0;
            Deque q = new ArrayDeque();
            String a = sc.next();
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='('){
                    q.add(a.charAt(j));
                }
                else {
                    if(q.isEmpty()){
                        ch=1;
                        break;
                    } else q.pollLast();
                }
            }
            if(ch==0 && q.isEmpty()) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}

