package boj_gold;
import java.util.*;
import java.io.*;
public class Boj1253_G4_TwoP {
    static int n;
    static int[] a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0; i<n;i++){
            count+=solution(i,a[i]);
        }
        System.out.println(count);
    }
    public static int solution(int index,int dap){
        int left = 0;
        int right=n-1;
        while(left<right){
            if(index == left){
                left+=1;
                continue;
            }
            if (index == right){
                right-=1;
                continue;
            }
            if(dap==a[left]+a[right]){
                return 1;
            } else if(dap>a[left]+a[right]){
                left+=1;

            } else right-=1;
        }
        return 0;
    }
}
