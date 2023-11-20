package 완전탐색;
import java.util.*;
import java.io.*;
public class Boj15649_S3 {
    static int[] a;
    static int m;
    static int n;
    static boolean[] visit;
    static int[] dap;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a=new int[n+1];
        dap=new int[m];
        visit = new boolean[n+1];
        for(int i=1;i<=n;i++){
            a[i]=i;
        }
        sol(0);
    }
    public static void sol(int depth){
        if(depth==m){
            for(int i=0;i<m;i++){
                System.out.print(dap[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=n;i++){
            if(visit[i]) continue; //가본적 있으면 패스
            visit[i]=true;
            dap[depth]=a[i];
            sol(depth+1);
            visit[i]=false;
        }
    }

}
