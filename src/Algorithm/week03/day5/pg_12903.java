package Algorithm.week03.day5;


public class pg_12903 {

    public String solution(String s){
        String result = "";

        String[] split = s.split("");
        double division = split.length / 2.0;

        for (int i=0; i< split.length; i++){
            if (split.length % 2 == 0) {
                result = split[(int) division-1] + split[(int) division];
            }else {
                result = split[(int) division];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12903 ss = new pg_12903();
        ss.solution("abcdefg");
    }
}
