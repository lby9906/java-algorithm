package Algorithm.week01.day5;

public class pg_12919 {

    public String solution(String[] seoul) {
        String result = "";
        for (int i=0; i< seoul.length; i++) {
            if (seoul[i].contains("Kim")) {
                result = "김서방은 " + i + "에 있다";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        pg_12919 ss = new pg_12919();
        String solution = ss.solution(new String[]{"Jane", "Kim"});
        System.out.println(solution.toString());
    }
}
