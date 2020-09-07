import java.util.*;

class Solution {
    public int solution(String S) {
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char currentChar : S.toCharArray()) {
            if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0;
                }
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}