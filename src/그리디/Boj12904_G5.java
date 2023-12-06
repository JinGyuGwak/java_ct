package 그리디;
import java.io.*;
import java.util.*; //1026점
public class Boj12904_G5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine(); // s -> t로 바꿔라
        StringBuilder a = new StringBuilder(t);
        int c = a.length();
        while(a.length() != s.length()){
            if(a.charAt(a.length()-1)=='A'){
                a.deleteCharAt(a.length()-1);
            } else {
                a.deleteCharAt(a.length()-1);
                a.reverse();
            }
        }
        System.out.println(a.toString().equals(s) ? 1 : 0);

    }
}