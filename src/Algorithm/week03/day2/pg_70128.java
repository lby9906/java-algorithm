package Algorithm.week03.day2;

public class pg_70128 {

    public int solution(int[] a, int[] b) {
        int result = 0;
        int multiplication = 0;

        for (int i=0; i<a.length; i++) {
            multiplication = a[i]* b[i];
            result += multiplication;
        }
        return result;
    }

    public static void main(String[] args) {
        pg_70128 ss = new pg_70128();
        int solution = ss.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
    }
}
