package 문자열;
import java.util.*;
import java.io.*;
public class Boj9935_G4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(br.readLine());
        String dap = br.readLine();
        int i=-1;
        int count=0;
        while(i<s.length()-1 && s.length()>0){
            i++;
            if(s.charAt(i)==dap.charAt(count)){
                count+=1;
                if(dap.length()==count){
                    s.delete(i-count+1,i+1);
                    i= (i-count>2) ?  i-count-2 : -1; // 문자 폭발 후 인덱스 재정의
                    i= (i-count>=0) ? i-count-1 : i;  //
                    count=0;
                }
            } else {
                if(s.charAt(i)==dap.charAt(0)){
                    count=1;
                }
                else {
                    count=0;
                }
            }
        }

        if(s.length()==0) System.out.println("FRULA");
        else System.out.println(s.toString());


    }
}
