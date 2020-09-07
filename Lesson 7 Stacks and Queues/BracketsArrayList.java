import java.util.*;

class Solution {
    public int solution(String S) {
        
        List<String> stack = new ArrayList<String>();
        
        for (int i = 0; i < S.length(); i++) {
            String currentChar = String.valueOf(S.charAt(i));
            switch(currentChar) {
                case "}":
                    if (stack.isEmpty() || !stack.remove(stack.size() - 1).equals("{")) { return 0; }
                    break;
                case ")":
                    if (stack.isEmpty() || !stack.remove(stack.size() - 1).equals("(")) { return 0; }
                    break;
                case "]":
                    if (stack.isEmpty() || !stack.remove(stack.size() - 1).equals("[")) { return 0; }
                    break;
                default:
                    stack.add(currentChar);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}