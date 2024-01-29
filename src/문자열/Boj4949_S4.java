package 문자열;
import java.util.*;
import java.io.*;
public class Boj4949_S4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            Stack<Character> stack = new Stack<>();
            String check = br.readLine();
            if(check.equals(".")){
                break;
            }
            int sw=0;
            for(int i=0;i<check.length();i++){
                if(check.charAt(i)=='.'){
                    break;
                } else if (check.charAt(i)=='[' || check.charAt(i)=='('){
                    stack.push(check.charAt(i));
                } else if(check.charAt(i)==']' && (stack.size()==0 || stack.peek()!='[')){
                    sw=1;
                    break;
                } else if(check.charAt(i)==')' && (stack.size()==0 || stack.peek()!='(')){
                    sw=1;
                    break;
                } else if((check.charAt(i)==')' || check.charAt(i)==']') && stack.size()!=0){
                    stack.pop();
                }
            }
            if(sw==0 && stack.size()==0)System.out.println("yes");
            else System.out.println("no");
        }
    }
}
