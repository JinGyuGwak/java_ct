package 문자열;
import java.util.*;
import java.io.*;
public class Boj1157_B1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(c-0>=97){
                c=(char)(c-32);
            }
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int dap=-1;
        char ans = 'a';

        for(int i : m.values()){
            dap=Math.max(dap,i);
        }
        int count=0;
        for(Map.Entry<Character, Integer> ma : m.entrySet()){
            if(ma.getValue()==dap){
                count+=1;
                ans=ma.getKey();
            }
        }
        if(count>1) System.out.println('?');
        else System.out.println(ans);
    }
}
