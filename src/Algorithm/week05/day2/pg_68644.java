package Algorithm.week05.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class pg_68644 {

    public int[] solution(int[] number){
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i=0; i< number.length; i++){
            for (int j=i+1; j< number.length; j++){
                sum = number[i] + number[j];
                set.add(sum);
                }
            }

        Integer[] arr = set.toArray(new Integer[0]);

        int[] array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        return Arrays.stream(array).sorted().toArray();
    }

    public static void main(String[] args) {
        pg_68644 ss = new pg_68644();
        ss.solution(new int[]{2,1,3,4,1});
    }
}
