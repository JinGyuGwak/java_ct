package lv3;

import java.util.*;


// 장르별 합 구하기 -> 장르 순위 구하기
// 장르별 첫번째곡, 두번째곡 인덱스 구하기 -> 그 인덱스 result 리스트에 추가

public class 베스트앨범 {
    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    public static int[] solution(String[] genres, int[] plays) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<plays.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }

        List<String> dap = new ArrayList<>();
        for(String a : map.keySet()){
            dap.add(a);
        }
        //장르선정
        Collections.sort(dap, (a,b)->map.get(b)-map.get(a)); //dap = {classic, pop, tab} 으로 이루어짐

        ArrayList<Music> result = new ArrayList<>();
        for(String gern : dap){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(gern)){
                    list.add(new Music(gern, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // 내림차순 소팅
            result.add(list.get(0)); 	// 1개는 무조건 수록
            if(list.size()!=1){ 	// 더 수록할 곡이 있으면(==장르 내의 노래가 1개보다 많으면) 수록
                result.add(list.get(1));
            }
        }

        // print result
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(베스트앨범.solution(new String[]{"classic", "pop","tab","classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500,300}));
    }
}
