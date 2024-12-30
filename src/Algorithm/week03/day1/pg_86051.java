package Algorithm.week03.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class pg_86051 {

    public int solution(int[] numbers){
        int result = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        List<Integer> listNum = Arrays.stream(numbers)
                        .boxed()
                .collect(Collectors.toList());

        Collections.sort(list);
        Collections.sort(listNum);

        for (int i=0; i<list.size(); i++){
            if (!listNum.contains(list.get(i))){
                result += list.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_86051 ss = new pg_86051();
        int solution = ss.solution(new int[]{1,2,3,4,6,7,8,0});
        System.out.println(solution);
    }
}
