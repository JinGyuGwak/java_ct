package 문자열;
// 정수 n을 입력 받았을 때 1,000,000 으로 출력하라

import java.util.*;
import java.io.*;
public class 테스트문제 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> de = new ArrayDeque<>();
        String s = br.readLine();
        for(int i=s.length()-1;i>=0;i--){ // i= 4,3,2,1,0
            de.addFirst(s.charAt(i));
        }
        int c=0;
        Deque<Character> li = new ArrayDeque<>();
        while(!de.isEmpty()){
            if(c==3){
                li.add(',');
                c=0;
            }
            c+=1;
            li.add(de.pollLast());
        }
        while(!li.isEmpty()){
            System.out.print(li.pollLast());
        }

    }
}
