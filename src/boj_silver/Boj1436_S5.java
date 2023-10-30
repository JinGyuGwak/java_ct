package boj_silver;
import java.util.*;
import java.io.*;
public class Boj1436_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int c=0;
        int dap=0;
        while(dap!=n){
            c+=1;
            if(Integer.toString(c).contains("666")){
                dap+=1;
            }
        }
        System.out.println(c);
    }
}
