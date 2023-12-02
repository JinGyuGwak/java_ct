package 그리디;
import java.io.*;
import java.util.*;
public class Boj1449_S3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int c=0;
        int now=1;
        int i=0;
        while(i<n){
            if(now+i<n &&a[i]-0.5+L >= a[i+now]+0.5){
                now+=1;
            } else {
                c+=1;
                i=i+now;
                now=1;
            }
        }
        System.out.println(c);
    }
}
