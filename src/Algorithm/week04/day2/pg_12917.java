package Algorithm.week04.day2;

import java.util.Arrays;
import java.util.Collections;

public class pg_12917 {

    public String solution(String s){
        String result = "";

        String[] arrStr = s.split("");
        Arrays.sort(arrStr, Collections.reverseOrder());

        for (int i=0; i<arrStr.length; i++){
            result += arrStr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12917 ss = new pg_12917();
        ss.solution("Zbcdefg");
    }
}
