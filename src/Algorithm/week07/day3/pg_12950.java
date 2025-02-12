package Algorithm.week07.day3;

public class pg_12950 {

    public int[][] solution(int[][] arr1, int[][] arr2){
        int[][] result = new int[arr1.length][arr1[0].length];

        for (int i=0; i<arr1.length; i++){
            for (int k=0; k<arr1[i].length; k++){
                result[i][k] = arr1[i][k] + arr2[i][k];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12950 ss = new pg_12950();
        ss.solution(new int[][]{{1,2},{2,3}}, new int[][]{{3,4},{5,6}});
//        ss.solution(new int[][]{{1},{2}}, new int[][]{{3},{4}});
    }
}
