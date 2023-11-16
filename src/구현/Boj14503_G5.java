package 구현;
import java.util.*;
import java.io.*;
public class Boj14503_G5 {
    static int n;
    static int m;
    static int[][] a;
    static int dap=0;
    static int[] x ={0,1,0,-1};
    static int[] y ={-1,0,1,0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        sol(r,c,d);
        System.out.println(dap);

    }
    //d의 값 0:북(0,-1) 1:동(1,0) 2:남(0,1) 3:서(-1,0)
    public static void sol(int r,int c,int d){//r이 y좌표, c가 x 좌표
        //조건 1
        if(a[r][c]==0){
            a[r][c]=-1;
            dap+=1;
        }
        // 0북 -> 3서 -> 2남 -> 1동 -> 북
        for(int i=0;i<4;i++){
            d=(d+3)%4;// 반시계 방향으로 90 회전
            int dx=c+x[d];
            int dy=r+y[d];
            if(a[dy][dx]==0){ //주변 청소 안 된 빈칸이 존재 한다면
                if(a[dy][dx]==0){
                    sol(dy,dx,d);
                    return;
                }
            }
        }
        //조건2
        d=(d+2)%4;
        if(a[r+y[d]][c+x[d]]==1) return;
        sol(r+y[d],c+x[d],(d+2)%4);
    }
}
