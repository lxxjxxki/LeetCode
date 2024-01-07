class Solution {
    public boolean isSubsequence(String s, String t) {
        Deque<Character> deque = new ArrayDeque<>();
        int sLen = s.length(), tLen = t.length();
        for (int i = 0; i < sLen; i++) {
            deque.addFirst(s.charAt(i));
        }
        for (int i = 0; i < tLen; i++) {
            deque.addLast(t.charAt(i));
        }

        for (int i = 0; i < tLen; i++) {
            if(deque.peekFirst() == deque.peekLast())
                deque.pollFirst();
            deque.pollLast();
        }
        boolean answer = false;
        if(deque.isEmpty()) answer = true;
        return answer;
    }
}
