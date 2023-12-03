package 그리디;
import java.util.*;
import java.io.*;
public class Boj1343_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String res = "";
        res= sol(s);
        System.out.println(res);
    }
    public static String sol(String s){
        String a;
        s=s.replaceAll("XXXX","AAAA");
        a = s.replaceAll("XX","BB");
        if(a.contains("X")){
            a="-1";
        }
        return a;

    }
}
