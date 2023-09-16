package boj_silver;
import java.util.*;
import java.io.*;

public class Boj2108_S3 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> a = new ArrayList<>();
        int c;
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            c=Integer.parseInt(br.readLine());
            a.add(c);

            map.put(c,map.getOrDefault(map.get(c),0)+1);
            sum+=c;
        }
        Collections.sort(a);
        int range = a.get(a.size()-1)-a.get(0);
        System.out.println(sum/(a.size()-1));
        System.out.println(a.get(a.size()-1));
        System.out.println(sum);
        System.out.println(range);


    }
}
