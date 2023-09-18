package lv2;

import java.util.PriorityQueue;

public class 더맵게 {

    public static int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i : scoville){
            heap.offer(i);
        }
        int i=0;
        int j=0;
        while(heap.peek()<k){
            answer+=1;
            if(heap.size()>=2) {
                i = heap.poll();
                j = heap.poll();
            } else return -1;
            heap.offer(i+(j*2));
        }


        return answer;
    }


    public static void main(String[] args){
        System.out.println(더맵게.solution(new int[]{1,2,3,9,10,12},7));

    }

}
