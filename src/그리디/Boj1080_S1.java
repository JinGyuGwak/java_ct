package 그리디;
import java.io.*;
import java.util.*;
public class Boj1080_S1 {
    static int[][] arr;
    static int[][] target;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr=new int[n][m];
        target=new int[n][m];
        for(int i=0;i<n;i++){
            String s =br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]= s.charAt(j)-'0';
            }
        }
        for(int i=0;i<n;i++){
            String s =br.readLine();
            for(int j=0;j<m;j++){
                target[i][j]= s.charAt(j)-'0';
            }
        }
        int c=0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(arr[i][j]!=target[i][j]){
                    sol(i,j);
                    c+=1;
                }
            }
        }
        if(Arrays.deepEquals(arr, target))System.out.println(c);
        else System.out.println(-1);
    }
    public static void sol(int y,int x){ //0 0 이 넘어왔어용
        for(int i=y;i<y+3;i++){
            for(int j=x;j<x+3;j++){
                arr[i][j] = arr[i][j]==1 ? 0 : 1;
            }
        }

    }
}

