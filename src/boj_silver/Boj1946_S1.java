package boj_silver;
import java.util.*;
import java.io.*;
public class Boj1946_S1 {
    static int n;
    static int m;

    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            m=Integer.parseInt(br.readLine());
            int[][] a = new int[m][2];
            for(int j=0;j<m;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a[j][0]=x;
                a[j][1]=y;
            }
            Arrays.sort(a, (o1, o2) -> {
                return o1[0]-o2[0];
            });
            int count = 1;
            int top=a[0][1];
            for(int j=1;j<m;j++){
                if(a[j][1]<top){
                    count+=1;
                    top=a[j][1];
                }
            }

            System.out.println(count);
        }
    }
}
