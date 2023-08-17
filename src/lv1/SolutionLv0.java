package lv1;
import java.util.*;
public class SolutionLv0 {
    public int solution0(int[] sides) { // 피자나눠먹기
        Arrays.sort(sides);
        if(sides[2]<sides[0] + sides[1]) return 1;
        else return 2;
    }
    public int solution1(int[] array, int height){ // 머쓱이보다 큰 사람
        int answer = 0;
        for(int i : array){
            if(height<i) answer+=1;
//            answer += (i>height) ? 1 : 0;
        }
        return answer;
   }
   public int[] solution2(int[] num_list){ //짝수 홀수 개수
        int[] answer = new int[2];
        for(int i : num_list){
            if(i%2==0) answer[1]+=1;
            else answer[0]+=1;
        }
        return answer;
   }
    public int solution3(int[] numbers) {
        int answer = numbers.length - 1;
        Arrays.sort(numbers);
        return numbers[answer]*numbers[answer-1];
    }
    public String solution4(String my_string) {
        StringBuilder reversed = new StringBuilder();

        for (int i = my_string.length() - 1; i >= 0; i--) {
            reversed.append(my_string.charAt(i));
        }

        return reversed.toString();
    }
}
