package Algorithm.week09.day4;

import java.util.Arrays;
import java.util.Collections;

public class pg_12941 {

    public int solution(int[] A, int[] B){
        int result = 0;

        Arrays.sort(A);
        Integer[] bArr = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(bArr, Collections.reverseOrder());

        for (int i=0; i< A.length; i++){
            result += A[i] * bArr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12941 ss = new pg_12941();
        ss.solution(new int[]{1,2}, new int[]{3,4});
    }
}
