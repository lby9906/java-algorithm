package Algorithm.week09.day1;

public class pg_136798 {

    public int solution(int number, int limit, int power){
        int result = 0;
        int[] saveArr = new int[number];

//        for (int i=1; i<=number; i++){
//            int count = 0;
//            for (int k=1; k<=number; k++){
//                if (i % k == 0){
//                    count++;
//                }
//            }
//            saveArr[i-1] = count;
//        }

//        for (int i=0; i< saveArr.length; i++){
//            if (saveArr[i] <= number){
//                result += saveArr[i];
//            }else {
//                result += power;
//            }
//        }
//        System.out.println(result);
//
//        return result;


        for (int i=1; i<=number; i++){
            int count = 0;
            for (int j = 1; j <= (int) Math.sqrt(i); j++){
                if (i % j == 0){
                    count += 2;
                }
                if (j * j == i){
                    count -= 1;
                }
            }

            result += limit < count ? power : count;
        }
        return  result;
    }

    public static void main(String[] args) {
        pg_136798 ss = new pg_136798();
        ss.solution(10,3,2);
    }
}
