package 완전탐색;
import java.io.*;
import java.util.*;
public class Boj1476_S5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken()); //지구 1~15
        int s = Integer.parseInt(st.nextToken()); //태양 1~28
        int m = Integer.parseInt(st.nextToken()); //달 1~19
        int[][][] a = new int[e+1][s+1][m+1];

        int checkE=0;
        int checkS=0;
        int checkM=0;
        int count=0;
        while(true){
            count++;
            checkE+=1;
            checkS+=1;
            checkM+=1;
            if(checkE == e && checkS==s && checkM==m) break;

            if(checkE==15) checkE=0;
            if(checkS==28) checkS=0;
            if(checkM==19) checkM=0;

        }
        System.out.println(count);




    }
}
