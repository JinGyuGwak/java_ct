package boj_silver;
import java.util.*;
import java.io.*;
public class Boj11725_S2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            list.get(x).add(y);
            list.get(y).add(x);
        }
        boolean[] visit = new boolean[n];
        int[] parentNode = new int[n];

        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        visit[0]=true;
        while(!q.isEmpty()){
            int now = q.poll();
            for(int i : list.get(now)){ // 6 4
                if(!visit[i]){
                    visit[i]=true;
                    q.add(i);
                    parentNode[i]=now;
                }
            }
        }
        for(int i=1;i<parentNode.length;i++){
            System.out.println(parentNode[i]+1);
        }


    }
}