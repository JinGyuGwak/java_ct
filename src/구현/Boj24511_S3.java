package 구현;
import java.util.*;
import java.io.*;
public class Boj24511_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n =Integer.parseInt(br.readLine());
        int[] flag = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            int t = Integer.parseInt(st.nextToken());
            if(t==0) flag[i]=3;
        }
        Deque<Integer> de = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int ch = Integer.parseInt(st.nextToken());
            if(flag[i]==3){
                de.addFirst(ch);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int count=0;
        for(int i=0; i<m;i++){
            de.add(Integer.parseInt(st.nextToken()));

            sb.append(de.pop()).append(" ");
            count+=1;
            if(count==m) break;
        }
        System.out.println(sb);

    }
}

