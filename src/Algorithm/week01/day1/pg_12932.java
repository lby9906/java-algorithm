package Algorithm.week01.day1;

import java.util.Scanner;

public class pg_12932 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String strNum = Integer.toString(num);
        String[] result = strNum.split("");
        int[] arr = new int[strNum.length()];

        for (int i=0; i< result.length; i++){
            arr[i] = Integer.parseInt(result[result.length-1-i]);
            System.out.println(arr[i]);
        }
    }
}
