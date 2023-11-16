package DFS_BFS;
import java.util.*;
import java.io.*;
public class Boj1987_G4 {
    static int r;
    static int c;
    static char[][] a;
    static int[] dap = new int[27]; //지나온 알파벳
    static int result=1;
    static int[] x = {1,-1,0,0};
    static int[] y = {0,0,1,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        a=new char[r][c];
        for(int i=0;i<r;i++){
            String t = br.readLine();
            for(int j=0;j<t.length();j++){
                a[i][j]=t.charAt(j);
            }
        }
        sol(0,0,0);
        System.out.println(result);
    }
    public static void sol(int x1, int y1,int co){
        if(dap[a[y1][x1]-'A']==1){
            result = Math.max(result,co);
        }else{
            dap[a[y1][x1]-'A']=1;
            for (int i = 0; i < 4; i++) {
                int dy = y1 + y[i];
                int dx = x1 + x[i];
                if (dy >= 0 && dy < r && dx >= 0 && dx < c) {
                    sol(dx,dy,co+1);
                }
            }
            dap[a[y1][x1]-'A']=0;
        }
    }
}
