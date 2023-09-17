package boj_gold;

import java.util.*;
import java.io.*;
public class Boj2470_G5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        // -99 -2 -1 5 9
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int hap = Integer.MAX_VALUE;
        int dl=0,dr=0;
        int left=0,right=n-1;
        while(left < right){
            if(a[left]+a[right] <= 0){
                if(Math.abs(hap)>Math.abs(a[left]+a[right])){
                    hap=a[left]+a[right]; //2
                    dl=left; dr=right;    // (0,4)
                }
                left+=1;
            }
            else {
                if(Math.abs(hap)>Math.abs(a[left]+a[right])){
                    hap=a[left]+a[right];
                    dl=left; dr=right;
                }
                right-=1;
            }
        }
        System.out.println(a[dl] + " " +a[dr]);

    }
}
