package DFS_BFS;
import java.util.*;
import java.io.*;

public class Boj2178_S1 {
    static int[][] a;
    static int[][] visit;
    static int[] dx= {0,0,-1,1};
    static int[] dy= {1,-1,0,0};
    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n =Integer.parseInt(st.nextToken());
        m =Integer.parseInt(st.nextToken());
        a=new int[n][m];
        visit = new int[n][m];

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<s.length();j++){
                a[i][j]=s.charAt(j)-'0';
            }
        }
        bfs(0,0);
        System.out.println(a[n-1][m-1]);
    }
    public static void bfs(int y, int x){
        int count=1;
        Deque<Pair> p = new LinkedList<>();
        p.add(new Pair(0,0));
        while(!p.isEmpty()){
            count+=1;
            Pair pa = p.poll();
            for(int i=0;i<4;i++){
                int ty=pa.py+dy[i];
                int tx=pa.px+dx[i];
                if(ty>=0 && ty<n && tx>=0 && tx<m){
                    if(a[ty][tx]==1 && visit[ty][tx]==0){
                        visit[ty][tx]=1;
                        a[ty][tx]=a[pa.py][pa.px]+1;
                        p.add(new Pair(tx,ty));
                    }
                }
            }
        }
    }
    static class Pair{
        int px;
        int py;
        public Pair(int x,int y){
            this.px=x;
            this.py=y;
        }
    }
}
