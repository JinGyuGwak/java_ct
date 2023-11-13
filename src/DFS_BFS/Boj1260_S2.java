package DFS_BFS;
import java.util.*;
import java.io.*;
public class Boj1260_S2 {
    static int[][] a;
    static int[] visit;
    static Deque<Integer> de = new LinkedList<>();
    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        a=new int[n+1][n+1];
        visit= new int[n+1];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int c1=Integer.parseInt(st.nextToken());
            int c2=Integer.parseInt(st.nextToken());
            a[c1][c2]=1;
            a[c2][c1]=1;
        }
        visit[v]=1;
        System.out.print(v + " ");
        dfs(v);
        System.out.println();
        visit= new int[n+1];
        de.add(v);
        System.out.print(v + " ");
        bfs(v);
        System.out.println();
    }
    public static void dfs(int now){
        for(int i=1;i<=n;i++){
            if(a[now][i]==1 && visit[i]==0){
                visit[i]=1;
                System.out.print(i + " ");
                dfs(i);
            }
        }
    }
    public static void bfs(int now){
        visit[now]=1;
        for(int i=1;i<=n;i++){
            if(a[now][i]==1 && visit[i]==0){
                de.add(i);
                visit[i]=1;
                System.out.print(i + " ");
            }
        }
        while(!de.isEmpty()){
            bfs(de.poll());

        }

    }
}
