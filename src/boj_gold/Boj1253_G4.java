package boj_gold;
import java.io.*;
import java.util.*;

public class Boj1253_G4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Pair> visited = new HashMap<>();  // {숫자, {좋은 수 여부, 현재 숫자 인덱스}}

        int[] v = new int[N];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            v[i] = Integer.parseInt(input[i]);
            visited.put(v[i], new Pair(false, i));
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int sum = v[i] + v[j];

                if (visited.containsKey(sum)) {
                    // 반드시 다른 숫자의 합
                    if (visited.get(sum).index == i || visited.get(sum).index == j) {
                        continue;
                    }

                    visited.get(sum).isGood = true;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (visited.get(v[i]).isGood) {
                result++;
            }
        }

        System.out.println(result);
    }

    static class Pair {
        boolean isGood;
        int index;

        Pair(boolean isGood, int index) {
            this.isGood = isGood;
            this.index = index;
        }
    }
}