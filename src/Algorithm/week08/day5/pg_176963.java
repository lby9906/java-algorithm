package Algorithm.week08.day5;

public class pg_176963 {

    public int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] result = new int[photo.length];

        for (int i=0; i< photo.length; i++){
            for (int j=0; j< photo[i].length; j++){
                for (int k=0; k< name.length; k++){
                    if (photo[i][j].equals(name[k])){
                        result[i] += yearning[k];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        pg_176963 ss = new pg_176963();
        ss.solution(
                new String[]{"may","kein","kain","radi"},
                new int[]{5,10,1,3,},
                new String[][]{
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}});
    }
}
