package Algorithm.week07.day5;

import java.util.Arrays;

public class pg_42748 {

    public int[] solution(int[] array, int[][] commands){
        int[] result = new int[commands.length];
        int[] arrNum = {};

        for (int i=0; i<commands.length; i++) {
            for (int j = 0; j < commands[i].length; j++) {
                arrNum = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                int k = commands[i][2];
                Arrays.sort(arrNum);
                result[i] = arrNum[k-1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_42748 ss = new pg_42748();
        ss.solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    }
}
