import java.util.*;

class Solution {
    public int solution(String S) {
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char currentChar : S.toCharArray()) {
            switch(currentChar) {
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') { return 0; }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') { return 0; }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') { return 0; }
                    break;
                default:
                    stack.push(currentChar);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}