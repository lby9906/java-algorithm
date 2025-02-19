package Algorithm.week08.day3;

import java.util.ArrayList;
import java.util.Collections;

public class pg_138477 {

    public int[] solution(int k, int[] score){
        int[] result = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0; i<score.length; i++){
            arr.add(score[i]);
            Collections.sort(arr, Collections.reverseOrder());
            if (arr.size() > k){
                arr.remove(arr.size()-1);
            }
            result[i] = arr.get(arr.size()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        pg_138477 ss = new pg_138477();
        ss.solution(4, new int[]{0,300,40,300,20,70,150,50,500,1000});
    }
}
