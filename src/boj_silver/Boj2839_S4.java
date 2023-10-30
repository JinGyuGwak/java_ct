package boj_silver;

import java.util.*;
import java.io.*;
public class Boj2839_S4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        int dap=0;
        while(n>=3){
            if(n%5!=0){
                n-=3;
                count+=1;
            } else {
                dap=n/5;
                break;
            }
        }
        if(dap!=0){
            System.out.println(dap+count);
        } else if(n==0){
            System.out.println(count);
        } else System.out.println(-1);

    }
}
