package 그리디;
import java.io.*;
import java.util.*;
public class Boj10610_S4 {
    static int[] array;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int c=0;
        array = new int[s.length()];
        for(int i=0; i<s.length();i++){
            array[i]=s.charAt(i)-'0';
            c+=s.charAt(i)-'0';
        }
        Arrays.sort(array);
        if(c%3==0 && s.contains("0"))sol(s);
        else System.out.println(-1);

    }
    public static void sol(String a){
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
