package Algorithm.week07.day4;

import java.util.ArrayList;

public class pg_68935 {

    public int solution(int n){
        int result = 0;
        String strNum = "";
        ArrayList<Integer> remainder = new ArrayList<>();

        while (n > 0){
            remainder.add(n%3);
            n = n/3;
        }

        for (int i=0; i<remainder.size(); i++){
            strNum += remainder.get(i);
        }

        result = Integer.parseInt(strNum, 3);
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        pg_68935 ss = new pg_68935();
        ss.solution(45);
    }
}
