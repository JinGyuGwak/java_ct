package 문자열;
import java.io.*;
import java.util.*;
public class Boj12919_G5 {
    static String s;
    static String t;
    static int dap=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        t = br.readLine();
        sol(s,t);
        if(dap==1) System.out.println(1);
        else System.out.println(0);


    }
    public static boolean sol(String index, String target) {
        if (index.equals(target)) {
            dap = 1;
            return true;
        }
        if(index.length()<target.length()) {
            if (target.charAt(target.length() - 1) == 'A') {
                sol(index, target.substring(0,target.length()-1));
            }

            if (target.charAt(0) == 'B') {
                String d = new StringBuilder(target).reverse().toString(); //뒤집고
                sol(index, d.substring(0,d.length()-1)); //맨 뒤의 비를 빼
            }
        }
        return false;
    }
}
