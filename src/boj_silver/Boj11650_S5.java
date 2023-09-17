package boj_silver;
import java.util.*;
import java.io.*;
public class Boj11650_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            a[i]=new int[]{x,y};
        }
        Arrays.sort(a, (o1, o2) -> {
            if(o1[0]==o2[0]) return o1[1]-o2[1];
            return o1[0]-o2[0];
        });
//        Arrays.sort(a,new Comparator<int[]>(){
//            public int compare(int[] o1, int[] o2){
//                if(o1[0]==o2[0]) return o1[1]-o2[1];
//                return o1[0]-o2[0];
//            }
//        });
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }

    }
}
