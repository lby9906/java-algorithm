package Algorithm.week10.day1;

public class pg_70129 {

    public int[] solution(String s){
        int zeroCount = 0;
        int transCount = 0;

        while(! s.equals("1")){
            int one = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroCount++;
                }else {
                    one++;
                }
            }
            s = Integer.toBinaryString(one);
            transCount++;
        }
        return new int[] {transCount, zeroCount};
    }

    public static void main(String[] args) {
        pg_70129 ss = new pg_70129();
        ss.solution("01110");
    }
}
