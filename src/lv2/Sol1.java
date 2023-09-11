package lv2;
import java.util.*;
public class Sol1 {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList();
        Queue<Integer> q = new ArrayDeque();
        for(int i=0; i<speeds.length;i++){
            q.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i]))); // 96 94
        }
        int c,check;
        while(!q.isEmpty()){ // 2 2
            c=1;
            check = q.poll();
            while(!q.isEmpty() && check >= q.peek()){
                q.poll();
                c+=1;
            }
            answer.add(c);

        }
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(Sol1.solution(new int[]{96,94},new int[]{3,3})));
    }
}
