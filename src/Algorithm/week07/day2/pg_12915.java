package Algorithm.week07.day2;

import java.util.*;

public class pg_12915 {

    public String[] solution(String[] strings, int n){

        Arrays.sort(strings, (a,b) -> {
            if (a.charAt(n) == b.charAt(n)){
                return a.compareTo(b);
            }
            return Character.compare(a.charAt(n), b.charAt(n));
        });
        return strings;
    }

    public static void main(String[] args) {
        pg_12915 ss = new pg_12915();
        ss.solution(new String[]{"sun", "bed", "car"}, 1);
    }
}
