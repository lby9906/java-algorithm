package Algorithm.week04.day1;

public class pg_77884 {

    public int solution(int left, int right){
        int result = 0;

        for (int i=left; i<=right; i++){
            int count = 0;
            for (int j=1; j<=100; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0) {
                result += i;
            }else {
                result -= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_77884 ss = new pg_77884();
        ss.solution(13,17);
    }
}
