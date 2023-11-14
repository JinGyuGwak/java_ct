package DFS_BFS;
import java.util.*;
import java.io.*;
public class Boj7562_S1 {
    static int n;
    static int m;
    static Pair r1;
    static Pair r2;
    static int[][] a;
    static int[][] visit;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            m=Integer.parseInt(br.readLine());
            a=new int[m][m];
            visit=new int[m][m];
            st = new StringTokenizer(br.readLine());
            r1=new Pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            r2=new Pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            bfs();
            System.out.println(a[r2.y][r2.x]);

        }
    }
    public static void bfs(){ //r1(시작점), r2(끝점)
        int[] my={2,2,-2,-2,1,1,-1,-1};
        int[] mx={1,-1,1,-1,2,-2,2,-2};
        Deque<Pair> de = new LinkedList<>();
        de.add(r1);
        while(!de.isEmpty()){ //
            Pair p = de.poll();// p.x=3 , p.y=1

            if(p.y==r2.y && p.x==r2.x)return;

            for(int i=0;i<8;i++){
                int dy=p.y+my[i];
                int dx=p.x+mx[i];

                if(dy>=0 && dy<m && dx>=0 && dx<m){
                    if(a[dy][dx]==0){
                        a[dy][dx]=a[p.y][p.x]+1;
                        de.add(new Pair(dx,dy));
                    }
//                    if(dy==r2.y && dx==r2.x) return a[p.y][p.x]+1;
                }
            }
        }

    }
    public static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}

