package DFS_BFS;
import java.util.*;
import java.io.*;
public class Boj2606_S3 {
    static int n;
    static int m;
    static int count=0;
    static int[] visit;
    static int[][] a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        visit = new int[n+1];
        a = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c1=Integer.parseInt(st.nextToken());
            int c2=Integer.parseInt(st.nextToken());
            a[c1][c2]=1;
            a[c2][c1]=1;
        }
        visit[1]=1;
        int dap = dfs(1);
        System.out.println(dap);

    }
    public static int dfs(int now){
        for(int i=1;i<=n;i++){
            if(a[now][i]==1 && visit[i]==0){
                visit[i]=1;
                count+=1;
                dfs(i);
            }
        }
        return count;
    }
}
