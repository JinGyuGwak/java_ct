package 그리디;
import java.io.*;
import java.util.*;
public class Boj1783_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //세로길이
        int m = Integer.parseInt(st.nextToken()); //가로길이
        //가장 왼쪽 아래
        // 0,0 시작해서 n,m 까지
        int count=1;
        int sw=0;
        if(m>=7 && n>=3) {
            count+=4;
            m-=6;
            sw=1;
        }
        while(n>2 && m>1){
            count+=1;
            m-=1;
        }
        while(n>1 && m>2){
            count+=1;
            m-=2;
        }
        if(sw==0 && count>4) count=4;
        System.out.println(count);



    }
}
