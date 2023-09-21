package boj_silver;
import java.util.*;
import java.io.*;

public class Boj14425_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(br.readLine(),1);
        }
        int count=0;
        for(int i=0;i<m;i++){
            String s = br.readLine();
            if(map.get(s)!=null)count+=1;
        }
        System.out.println(count);
    }

}
