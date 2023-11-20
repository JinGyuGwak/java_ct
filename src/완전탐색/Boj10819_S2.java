package 완전탐색;
import java.util.*;
import java.io.*;
public class Boj10819_S2 {
    static int[] arr, nums;
    static boolean[] visit;
    static int n, result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        arr = new int[n];
        visit = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        sol(0);
        System.out.println(result);
    }
    public static void sol(int cnt) { //값 저장은 arr에서 하는 중
        if(cnt==n){
            int hap=0;
            for(int i=0;i<n-1;i++){
                hap+=Math.abs(arr[i]-arr[i+1]);
            }
            result=Math.max(result,hap);
            return;
        }
        for(int i=0;i<n;i++){
            if(visit[i])continue;
            visit[i]=true;
            arr[cnt]=nums[i];
            sol(cnt+1);
            visit[i]=false;
        }

    }

}
