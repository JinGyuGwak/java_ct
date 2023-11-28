package 문자열;
import java.util.*;
import java.io.*;
public class Boj1181_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            String input = br.readLine();
            s[i]=input;
        }
        Arrays.sort(s);
        Arrays.sort(s,(a1,a2)-> a1.length()-a2.length());

        String a ="";
        for(int i=0;i<n;i++){
            if(!a.equals(s[i])) {
                System.out.println(s[i]);
            }
            a=s[i];

        }
    }

}
