package Algorithm.week01.day4;

import java.util.Scanner;

public class pg_12934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long result = 0;

        long sqrt = (long) Math.sqrt(num);

        if (num == sqrt*sqrt) {
            result = (sqrt+1)*(sqrt+1);
            System.out.println(result);
        } else {
            result = -1;
            System.out.println(result);
        }
    }
}
