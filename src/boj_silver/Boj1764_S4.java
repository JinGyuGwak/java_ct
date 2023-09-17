package boj_silver;

import java.util.*;
import java.io.*;
public class Boj1764_S4 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        List<String> dap = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = br.readLine();
            map.put(s,1);
        }
        for(int i=0;i<m;i++){
            String s = br.readLine();
            if(map.get(s)!=null){
                dap.add(s);
            }


        }
        System.out.println(dap.size());
        Collections.sort(dap, (o1,o2) -> {
            return o2.compareTo(o1);
        });

        for(String a : dap) {
            System.out.println(a);
        }
    }
}
