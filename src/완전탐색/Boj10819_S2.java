package 완전탐색;
import java.util.*;
import java.io.*;
public class Boj10819_S2 {
    static int[] arr, nums;
    static boolean[] visited;
    static int n, result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        arr = new int[n];
        visited = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        System.out.println(result);
    }
    public static void dfs(int cnt) {
        if (cnt == n) {
            int total = 0;
            for (int i = 0; i < n - 1; i++) {
                total += Math.abs(arr[i] - arr[i + 1]);
            }
            result = Math.max(result, total);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            arr[cnt] = nums[i];
            dfs(cnt + 1);
            visited[i] = false;
        }
    }

}
