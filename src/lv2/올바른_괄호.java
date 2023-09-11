package lv2;
import java.util.*;
public class 올바른_괄호 {
    static boolean solution(String s){
        boolean answer = true;
        Queue q = new ArrayDeque();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(q.isEmpty()) return false;
                else q.poll();
            } else {
                q.add('(');
            }

        }
        if(!q.isEmpty()) answer=false;
        return answer;
    }
    public static void main(String[] args){
        System.out.println(올바른_괄호.solution("(())()"));
    }
}
