import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        String answer = "";
        Stack<String> st = new Stack<>();
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
        StringBuilder sb = new StringBuilder();
        
        while (stringTokenizer.hasMoreTokens()) {
            st.push(stringTokenizer.nextToken());
        }
        
        while (!st.isEmpty()) {
            sb.append(st.pop());
            if(!st.isEmpty()) sb.append(" ");
        }
        
        answer = sb.toString();
        
        return answer;
    }
}