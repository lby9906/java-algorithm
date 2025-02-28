package Algorithm.week09.day5;

public class pg_12951 {

    public String solution(String s){
        String result = "";

        String[] split = s.split(" ", -1);

        for (int i=0; i<split.length; i++) {
            if (!split[i].isEmpty()){
                result += split[i].substring(0, 1).toUpperCase() + split[i].substring(1).toLowerCase();
            }
            if (i < split.length-1){
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12951 ss = new pg_12951();
        ss.solution("3people unFollowed me");
    }
}
