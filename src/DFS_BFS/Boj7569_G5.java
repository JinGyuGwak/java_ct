package DFS_BFS;
import java.io.*;
import java.util.*;
public class Boj7569_G5 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int[][][] bfs = new int[h][n][m];
        int[][][] visit=new int[h][n][m];
        int[] rz = { 0, 0, 0, 0, -1, 1 };
        int[] ry = { 0, 0, -1, 1, 0, 0 };
        int[] rx = { -1, 1, 0, 0, 0, 0 };
        Deque<Node> q = new ArrayDeque<>();
        for(int i=0;i<h;i++){
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<m;k++){
                    bfs[i][j][k]=Integer.parseInt(st.nextToken());
                    if(bfs[i][j][k] == 1){
                        q.add(new Node(i, j, k,0));
                        visit[i][j][k]=1;
                    }
                }
            }
        }
        int dap=0;
        while (!q.isEmpty()) {
            Node node = q.pop();
            for(int i=0;i<6;i++){
                int dz=node.z+rz[i];
                int dy=node.y+ry[i];
                int dx=node.x+rx[i];
                if(dz>=0 && dz<h && dy>=0 && dy<n && dx>=0 && dx<m && visit[dz][dy][dx]==0 && bfs[dz][dy][dx]==0){
                    bfs[dz][dy][dx]=1;
                    visit[dz][dy][dx]=1;
                    q.add(new Node(dz,dy,dx,node.count+1));
                    dap=Math.max(dap,node.count+1);
                }
            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<n;j++){
                for(int k=-0;k<m;k++){
                    if(bfs[i][j][k]==0){
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(dap);
    }
    public static class Node {
        int y;
        int x;
        int z;
        int count;
        public Node(int z,int y, int x,int count){
            this.z=z;
            this.y=y;
            this.x=x;
            this.count=count;
        }
    }
}
