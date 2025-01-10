package Algorithm.week04.day5;

public class pg_147355 {

    public int solution(String t, String p){
        int result = 0;

        for (int i=0; i<=t.length()-p.length(); i++){
            String substring = t.substring(i, p.length()+i);
            long strInt = Long.parseLong(substring);
            long pInt = Long.parseLong(p);

            if (strInt <= pInt){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_147355 ss = new pg_147355();
        ss.solution("10203", "15");
    }
}
