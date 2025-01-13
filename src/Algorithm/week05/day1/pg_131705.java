package Algorithm.week05.day1;

public class pg_131705 {
    public int solution(int[] number){
        int result = 0;

        for (int i=0; i<number.length-2; i++){
            for (int j=i+1; j<number.length-1; j++){
                for (int k=j+1; k< number.length; k++){
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_131705 ss = new pg_131705();
        ss.solution(new int[]{-2,3,0,2,-5});
    }
}
