package DFS_BFS;
import java.util.*;
import java.io.*;
public class Boj1753_G4 {
    static int V;
    static int E;
    static int k;
    static int[][] a;
    static int[] visit;
    static int[] dap;
    static int m = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V=Integer.parseInt(st.nextToken());
        E=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(br.readLine()); //시작점
        a=new int[V+1][V+1];

        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            a[u][v]=w;
        }
        dap=new int[V+1];
        visit=new int[V+1];
        Arrays.fill(dap,Integer.MAX_VALUE);

        sol(k);
        for(int i=1;i<=V;i++){
            if(i==k)System.out.println(0);
            else if(dap[i]==Integer.MAX_VALUE)System.out.println("INF");
            else System.out.println(dap[i]+m+2);
        }
    }
    public static void sol(int target){ //0이 아닌 곳을 파고들면서 체크
        //시작점 k=1
        int count=0;
        for(int i=1;i<=V;i++){
            if(a[target][i]!=0){
                count=dap[target]+a[target][i];
                dap[i]=Math.min(dap[i],count);
                sol(i);
            }
        }
    }

}
