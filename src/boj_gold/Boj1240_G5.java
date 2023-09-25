package boj_gold;
import java.util.*;
import java.io.*;  // 노드 풀이 : https://loosie.tistory.com/517
public class Boj1240_G5 {
    static int[][] a;
    static int n;
    static int n1;
    static int n2;
    static int[] visit;
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new int[n+1][n+1];
        for(int i=0;i<n-1;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());
            a[x][y]=z;
            a[y][x]=z;
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            n1=Integer.parseInt(st.nextToken());
            n2=Integer.parseInt(st.nextToken());
            visit = new int[n+1];
            visit[n1]=1;
            count=0;
            sol(n1);
        }
    }
    public static void sol(int now){ // 3

        if(a[now][n2]!=0){
            System.out.println(count+=a[now][n2]);
            return ;
        }
        for(int i=1;i<=n;i++){
            if(a[now][i]!=0 && visit[i]==0){
                visit[i]=1;
                count+=a[now][i];
                sol(i);
            }
        }
    }
}
