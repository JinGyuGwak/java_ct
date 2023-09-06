package boj_silver;
import java.util.*;
public class Boj1012_S2 {
    static int[][] map;
    static int[][] visit;
    static int result=0;
    static int t,m,n,k;

    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i = 0 ;i<t;i++){
            result=0;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            map=new int[m][n];
            visit=new int[m][n];
            for(int c=0;c<k;c++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                map[b][a]=1;
            }
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(map[j][k]==1 && visit[j][k]==0){
                        dfs(k,j);
                        result+=1;
                    }
                }
            }
            System.out.println(result);
        }

    }
    public static void dfs(int x, int y){
        visit[y][x]=1;
        for(int i=0;i<4;i++){
            int xx=x+dx[i];
            int yy=y+dy[i];
            if(yy<0 || yy>=m || xx<0 || xx>=n){
                continue;
            }
            else if(map[yy][xx]==1 && visit[yy][xx]==0){
                dfs(xx,yy);
            }
        }
    }


}
