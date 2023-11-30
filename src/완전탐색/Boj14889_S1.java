package 완전탐색; //6시 56분 시작
import java.util.*;
import java.io.*;
public class Boj14889_S1 { //조합문제
    static int n;
    static int[][] a;
    static int[] visit;
    static Deque<Integer> de = new ArrayDeque<>();
    static Deque<Integer> start = new ArrayDeque<>();
    static int r;
    static int v1=0;
    static int v2=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        r=Integer.MAX_VALUE;
        visit = new int[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        sol(0,0);
        System.out.print(r);
    }
    public static void sol(int depth, int b){
        if(depth==n/2){
            for(int i=0;i<n;i++){
                if(visit[i]==0){
                    for(int j=0;j<n;j++){
                        if(visit[j]==0)v1+=a[i][j];
                    }
                }
                else {
                    for(int j : de){
                        v2+=a[i][j];
                    }
                }
            }
            r=Math.min(r,Math.abs(v1-v2));
            v1=0;v2=0;

        }
        for(int i=b; i<n;i++){
            if(visit[i]==1)continue;
            visit[i]=1;
            de.add(i); //de= 비짓트
            sol(depth+1,i+1);
            visit[i]=0;
            de.pollLast();
        }
    }
}
