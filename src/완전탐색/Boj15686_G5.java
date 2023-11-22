package 완전탐색;

import java.util.*;
import java.io.*;
public class Boj15686_G5 {
    static List<Integer> li;
    static int n;
    static int[][] a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        li=new ArrayList<>();
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a=new int[n][n];
        //2인 경우 값 저장
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    li.add(sol(i,j));
                }
            }
        }
        Collections.sort(li);
        int dap=0;
        for(int i=0;i<m;i++){
            dap+=li.get(i);
        }
        System.out.println(li.toString());
        System.out.println(dap);


    }
    public static int sol(int y, int x){ //도시의 치킨거리는 모든 집의 치킨거리의 합
        int hap=99999;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){ //y는 집의좌표, i는 치킨집좌표
                if(a[i][j]==2){
                    hap=Math.min(hap,Math.abs(y-i)+Math.abs(x-j));
                }
            }
        } //한 점에서 모든 치킨거리를 구해야 하나?
        return hap;
    }
}
