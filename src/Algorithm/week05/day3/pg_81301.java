package Algorithm.week05.day3;

public class pg_81301 {

    public int solution(String s) {
        int result = 0;
        String[] strArr = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i=0; i< strArr.length; i++){
            s = s.replace(strArr[i], String.valueOf(i));
        }

        result = Integer.valueOf(s);
        return result;
    }

    public static void main(String[] args) {
        pg_81301 ss = new pg_81301();
        ss.solution("one4seveneight");
    }
}
