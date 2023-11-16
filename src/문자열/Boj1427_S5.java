package 문자열;
import java.util.*;
import java.io.*;
public class Boj1427_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> li = new ArrayList<>();
        while(n>0){
            if(n/10>=1){
                li.add(n%10);
                n=n/10;
            } else {
                li.add(n);
                n=0;
            }
        }
        Collections.sort(li,(n1,n2) -> n2-n1);
        for(int i:li){
            System.out.print(i);
        }

    }
}
