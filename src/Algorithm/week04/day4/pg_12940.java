package Algorithm.week04.day4;

public class pg_12940 {

    public int[] solution(int n, int m){
        int[] result = new int[2];
        int divisor = 0;

        for (int i=1; i<=n && i<=m; i++){
            if (n % i == 0 && m % i == 0){
                divisor = i;
            }
        }
        result[0] = divisor;
        result[1] = (n*m) / divisor;

        return result;
    }

    public static void main(String[] args) {
        pg_12940 ss = new pg_12940();
        ss.solution(3,12);
    }
}
