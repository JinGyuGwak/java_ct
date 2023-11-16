package Greedy;
import java.util.*;
import java.io.*;
public class Boj19598_G5 {
    static int[][] a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        a=new int[n][2];
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            a[i][0]=x;
            a[i][1]=y;
        }
        Arrays.sort(a,(n1,n2) -> n1[0]-n2[0]);
        int c=1;
        for(int i=0;i<n;i++){
//            System.out.println(Arrays.toString(a[i]));
            if(p.isEmpty()){
                p.add(a[i][1]);
            } else if(a[i][0]<p.peek()){
                p.add(a[i][1]);
                c+=1;
            } else if(a[i][0]>=p.peek()){
                p.poll();
                p.add(a[i][1]);
            }
        }
        System.out.println(c);

    }
}
