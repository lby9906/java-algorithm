package Algorithm.week06.day2;

public class pg_134240 {

    public String solution(int[] food){
        String result = "";
        int count = 0;

        for (int i=1; i<food.length; i++){
            if (food[i] >= 2){
                count = food[i] / 2;
                for (int k=1; k<=count; k++){
                    result += String.valueOf(i);
                }
            }
        }
        result += String.valueOf(0);
        String[] split = result.split("");
        for (int i = split.length-2; i>=0; i--){
            result += split[i];
        }
        return result;
    }
    public static void main(String[] args) {
        pg_134240 ss = new pg_134240();
        ss.solution(new int[]{1,7,1,2});
    }
}
