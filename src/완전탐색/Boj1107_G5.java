package 완전탐색;
import java.io.*;
import java.util.*;
public class Boj1107_G5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] visit = new int[10];
        if (m != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                visit[Integer.parseInt(st.nextToken())] = 1;
            }
        }
    }
}
