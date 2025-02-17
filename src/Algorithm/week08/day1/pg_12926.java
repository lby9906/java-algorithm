package Algorithm.week08.day1;

public class pg_12926 {

    public String solution(String s, int n){
        String result = "";

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch = (char) ('A' + (ch - 'A' + n) % 26);
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + n) % 26);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        pg_12926 ss = new pg_12926();
        ss.solution("a B z", 4);
    }
}
