package Algorithm.week02.day4;

public class pg_76501 {

    public int solution(int[] absolutes, boolean[] signs){
        int sum = 0;

        for (int i=0; i<absolutes.length; i++){
            if (signs[i] == false) {
                int num = absolutes[i] * -1;
                sum += num;
            }else {
                sum += absolutes[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        pg_76501 ss = new pg_76501();
        int solution = ss.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});
        System.out.println(solution);
    }
}
