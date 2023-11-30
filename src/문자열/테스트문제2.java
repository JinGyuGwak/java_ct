package 문자열;
import java.io.*;
import java.util.*;

public class 테스트문제2 { //12345 를 입력받으면 12,345 로 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n);
        Deque<Character> de = new ArrayDeque<>();
        int c=1;
        for(int i=s.length()-1 ; i>=0 ; i--){ //12345
            de.add(s.charAt(i)); //543,21
            if(c%3==0 && i!=0){
                de.add(',');
                c=0;
            }
            c+=1;
        }
        while(!de.isEmpty()){
            System.out.print(de.pollLast());
        }

    }

}
