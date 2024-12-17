package Algorithm.week02;


import java.util.Arrays;

public class pg_12910 {

    public int[] solution(int[] arr, int divisor){
        int count = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] % divisor == 0) {
                count ++;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }

        int[] result = new int[count];
        int num = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                result[num++] = arr[i];
            }
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        pg_12910 ss = new pg_12910();
        int[] solution = ss.solution(new int[]{2, 36, 1, 3}, 1);
        System.out.println(Arrays.toString(solution));
    }
}
