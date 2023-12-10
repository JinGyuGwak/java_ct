package 디피;
import java.io.*;
import java.util.*;
public class Boj2775_B1 {
    static int[][] a = new int[15][15];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=1;i<15;i++){
            a[0][i]=i;
        }
        sol();
        for(int i=0;i<T;i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            System.out.println(a[k][n]);

        }
    }
    public static void sol(){ //n은 방 넘버임
        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                a[i][j]=a[i][j-1]+a[i-1][j];
            }
        }
    }
}
