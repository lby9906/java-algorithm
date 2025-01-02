package Algorithm.week03.day4;

public class pg_12922 {

    public String solution(int n){
        String result = "";

        for (int i=0; i<n; i++){
            if (i % 2 == 0){
                result += "수";
            }else {
                result += "박";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12922 ss = new pg_12922();
        ss.solution(6);
    }
}
