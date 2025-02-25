package Algorithm.week09.day2;


public class pg_12939 {

    public String solution(String s){
        String[] split = s.split(" ");
        String max = String.valueOf(split[0]);
        String min = String.valueOf(split[0]);
        for (int i=0; i<split.length; i++){
            if (Integer.parseInt(max) < Integer.parseInt(split[i])){
                max = split[i];
            } else if (Integer.parseInt(min) > Integer.parseInt(split[i])){
                min = split[i];
            }
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        pg_12939 ss = new pg_12939();
        ss.solution("-1 -2 -3 -4");
    }
}
