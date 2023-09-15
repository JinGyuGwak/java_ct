package lv1;
import java.util.*;

public class K번째_수 {
    public static int[] solution(int[] array, int[][] commands){
        List<Integer> dap = new ArrayList<>();
        for(int[] a : commands){
            int[] copy = Arrays.copyOfRange(array, a[0] - 1, a[1]);
            Arrays.sort(copy);
            dap.add(copy[a[2]-1]);

        }
        return dap.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(K번째_수.solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}})));
    }
}
