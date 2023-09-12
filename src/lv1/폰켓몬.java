package lv1;

import java.util.*;

public class 폰켓몬 {

    public static int solution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return Math.min(nums.length / 2, set.size());


    }

    public static void main(String[] args){

        System.out.println(폰켓몬.solution(new int[]{3,3,3,2,2,2}));


    }

}
