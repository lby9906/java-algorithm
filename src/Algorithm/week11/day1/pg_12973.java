package Algorithm.week11.day1;

import java.util.Stack;

public class pg_12973 {
    public int solution(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1:0;
    }

    public static void main(String[] args) {
        pg_12973 ss = new pg_12973();
        ss.solution("baabaa");
    }
}
