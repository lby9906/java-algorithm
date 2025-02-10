package Algorithm.week07.day1;

import java.util.HashMap;
import java.util.Map;

public class pg_142086 {

    public int[] solution(String s){
        int[] result = new int[s.length()];

        String[] split = s.split("");
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<split.length; i++){
            if (!map.containsKey(s.charAt(i))){
                result[i] = -1;
                map.put(s.charAt(i),i);
            }else {
                result[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i),i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_142086 ss = new pg_142086();
        ss.solution("banana");
    }
}
