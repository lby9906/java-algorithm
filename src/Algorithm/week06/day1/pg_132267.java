package Algorithm.week06.day1;

public class pg_132267 {

    public int solution(int a, int b, int n){
        int result = 0;
        int num = n;

        while(num >= a){
            int full = (num / a) * b;
            result += full;
            num = (num % a) + full;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        pg_132267 ss = new pg_132267();
        ss.solution(2,1,20);
    }
}
