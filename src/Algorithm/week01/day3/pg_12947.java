package Algorithm.week01.day3;

import java.util.Scanner;

public class pg_12947 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean result = true;
        int num = in.nextInt();
        int count = 0;
        int sum = 0;

        String str = Integer.toString(num);
        String[] arr = str.split("");
        for (int i=0; i< arr.length; i++){
            if (arr[i].length() == 1){
                count++;
            }
        }

        int[] arrInt = new int[count];
        for (int i=0; i< arrInt.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        for (int i=0; i< arrInt.length; i++){
            sum += arrInt[i];
        }

        if (num % sum == 0){
            System.out.println(result);
        }else {
            result = false;
            System.out.println(result);
        }
    }
}
