package 그리디;
import java.io.*;
import java.util.*;
public class Boj1213_S3 {
    static int[] li = new int[26];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        for(int i=0;i<name.length();i++){
            li[name.charAt(i)-'A']+=1;
            // A~Z 의 개수를 넣는다
        }
        int count=0;
        int center=0;
        for(int i=0;i<26;i++){
            if(li[i]%2!=0){
                count+=1;
                center=i;
            }
        }
        if(count>1 || (count==1 && name.length()==2)) System.out.println("I'm Sorry Hansoo");
        else {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                for(int j=0;j<li[i]/2;j++){
                    sb.append((char)(i+65));
                }
            }
            String dap="";
            dap=dap+sb.toString();
            if(count==1)dap+=(char)(center+65);
            dap=dap+sb.reverse();
            System.out.println(dap);
        }
    }
}
