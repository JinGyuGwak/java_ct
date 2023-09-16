package boj_silver;
import java.io.*;
import java.util.*;

/**
 3
 1 0
 5
 4 2
 1 2 3 4
 6 0
 1 1 9 1 1 1
 */
public class Boj1966_S3 {

    static int n;
    static int m;
    static Deque<Integer> queue ;
    static Deque<Integer> indexQ;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            queue = new ArrayDeque();
            indexQ = new ArrayDeque();

            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            st=new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                int a= Integer.parseInt(st.nextToken());
                queue.add(a);
                indexQ.add(j);
            }
            solve();
        }

    }
    public static void solve(){
        int count=1;
        int max = Collections.max(queue);

        while(true){
            int q = queue.poll();
            int index = indexQ.poll();
            if(q==max){
                if(index == m){
                    System.out.println(count);
                    break;
                }
                count+=1;
                max=Collections.max(queue);
            }
            else {
                queue.add(q);
                indexQ.add(index);
            }

        }
    }
}
