package Algorithm.week08.day2;

public class pg_86491 {

    public int solution(int[][] sizes){
        int result = 0;
        int maxW = 0;
        int maxH = 0;

        for (int i=0; i<sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];

            if (w < h){
                int temp = w;
                w = h;
                h = temp;
            }

            if (maxW < w) {
                maxW = w;
            }
            if (maxH < h){
                maxH = h;
            }
        }
        result = maxW*maxH;
        return result;
    }

    public static void main(String[] args) {
        pg_86491 ss = new pg_86491();
        ss.solution(new int[][]{{60,50},{30,70},{60,30},{80,40}});
    }
}
