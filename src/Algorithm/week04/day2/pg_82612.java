package Algorithm.week04.day2;

public class pg_82612 {

    public long solution(int price, int money, int count){
        long totalPrice = 0;
        long result = 0;

        for (int i=1; i<=count; i++){
            totalPrice += price*i;
        }
        if (money < totalPrice) {
            result = totalPrice - money;
        }else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        pg_82612 ss = new pg_82612();
        ss.solution(3,20,4);
    }
}
