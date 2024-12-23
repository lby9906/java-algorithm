package Algorithm.week02.day1;

public class pg_12943 {

    int count = 0;

    public int even(int num) {
        num = num / 2;
        count++;
        return num;
    }

    public int odd(int num) {
        num = (num * 3) + 1;
        count++;
        return num;
    }

    public int solution(int num) {
        if (num == 1) {
            return 0;
        }

        for (int i = 1; i <= 400; i++) {
            if (num == 1) {
                return count;
            }

            if (num % 2 == 0) {
                num = even(num);
            } else {
                num = odd(num);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        pg_12943 ss = new pg_12943();
        int solution = ss.solution(626331);
        System.out.println(solution);
    }
}
