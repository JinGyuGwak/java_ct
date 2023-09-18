package boj_gold;
import java.util.*;
import java.io.*;
public class Boj1253_G4 { //다시 풀기 (객체 해시맵 + 투포인터)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int t = Integer.parseInt(st.nextToken());
            a[i]=t;
            map.put(t,1);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=a[i]+a[j];
                if(map.containsKey(sum)){
                    map.put(a[i]+a[j],0);
                }
            }
        }
        int count=0;
        for(int i=0; i<n;i++){
            if(map.get(a[i])==0) count+=1;
        }
        System.out.println(count);
    }
}
