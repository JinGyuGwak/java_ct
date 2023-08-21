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
    public int solution5(String[] s1, String[] s2){
        int a=0;
        List<String> list=Arrays.asList(s2);
        for(String s : s1){
            if(list.contains(s)) a+=1;

        }
        return a;
    }
    public String solution6(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
    public int solution7(int[] dot){
        if(dot[0]>0 && dot[1]>0) return 1;
        else if(dot[0]<0 && dot[1]>0) return 2;
        else if(dot[0]<0 && dot[1]<0) return 3;
        else return 4;
    }
    public int solution8(int price){
        double a = price;
        if(price>=500000) a=a*0.8;
        else if(price>=300000) a=a*0.9;
        else if(price>=100000) a= a*0.95;
        return (int)a;
    }
    public int solution9(String str1, String str2) {
        if(str1.contains(str2)) return 1;
        else return 2;
    }
    public int[] solution10(String[] strlist){
        int[] answer= new int[strlist.length];
        int count=0;
        for(String a : strlist){
            answer[count]=a.length();
            count++;
        }
        return answer;
    }
    public int[] solution11(int[] numbers){
        int[] answer=new int[numbers.length];
        for(int i = 0 ; i< numbers.length ; i++){
            answer[i]= numbers[i]*2;
        }
        return answer;
    }
    public int[] solution12(int[] numbers, int num1, int num2){
        int[] answer = new int[numbers.length];

        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }

}
