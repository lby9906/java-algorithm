package Algorithm.week08.day4;

public class pg_17681 {

    public String[] solution(int n, int[] arr1, int[] arr2){
        String[] result = new String[n];
        String replace1 = "";
        String replace2 = "";

        for (int i=0; i<n; i++){
            int num = arr1[i] | arr2[i];

            String mergedBinary = String.format("%" + n + "s", Integer.toBinaryString(num)).replace(' ', '0');

            result[i] = mergedBinary.replace('0', ' ').replace('1', '#');
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        pg_17681 ss = new pg_17681();
        ss.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
    }
}
