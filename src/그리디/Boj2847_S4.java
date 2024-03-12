package 그리디;
import java.util.*;
import java.io.*;

public class Boj2847_S4 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int result=0;
        for(int i=n;i>=1;i--){
            if(a[i]<=a[i-1]){ // 5  7
                result += a[i-1]-a[i]+1;
                a[i-1]=a[i]-1;
            }
        }
        System.out.println(result);
    }
}
