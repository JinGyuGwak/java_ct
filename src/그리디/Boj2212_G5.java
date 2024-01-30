package 그리디;
import java.util.*;
import java.io.*;
public class Boj2212_G5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] dif = new int[n-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            dif[i]=a[i+1]-a[i];
        }
        Arrays.sort(dif);
        int answer=0;
        for(int i=0;i<n-k;i++){
            answer+=dif[i];
        }

        System.out.println(answer);
    }
}
