package Algorithm.week06.day3;

public class pg_12930 {

    public String solution(String s){
        String result = "";
        String[] split = s.split("");

        int index = 0;
        for (int i=0; i<split.length; i++){
            if (split[i].equals(" ")){
                index = 0;
            }else if (index % 2 == 0){
                split[i] = split[i].toUpperCase();
                index++;
            } else {
                split[i] = split[i].toLowerCase();
                index++;
            }
            result += split[i];
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12930 ss = new pg_12930();
        ss.solution("try hello world");
    }
}
