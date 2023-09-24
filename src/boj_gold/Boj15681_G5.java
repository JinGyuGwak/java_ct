package boj_gold;
import java.util.*;
import java.io.*;
public class Boj15681_G5 {
    static List<List<Integer>> list = new ArrayList<>();
    static int[] visit;
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        visit = new int[N+1];
        dp= new int[N+1];
        for(int i=1;i<=N+1;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<N-1;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }
        Arrays.fill(dp,1);

        start(R,-1);
        for(int i=0;i<Q;i++){
            int x = Integer.parseInt(br.readLine());
            System.out.println(dp[x]);
        }

    }
    static void start(int now, int parent){ // 1 3
        visit[now]=1;
        for(int a : list.get(now)){
            if(visit[a]==0){
                start(a,now);
            }
        }
        if(parent!=-1) dp[parent]+=dp[now];
    }
}