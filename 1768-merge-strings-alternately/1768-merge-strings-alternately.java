import java.util.Stack;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergeWord = "";
        int firstWordLength = word1.length();
        int secondWordLength = word2.length();
        StringBuilder sb = new StringBuilder();

        int remainder = Math.abs(firstWordLength - secondWordLength);
        int minWordLength = Math.min(firstWordLength, secondWordLength);

        Stack firstStack = new Stack();
        Stack secondStack = new Stack();

        for (int i = 0; i < firstWordLength; i++) {
            firstStack.push(word1.charAt(firstWordLength - i - 1));
        }

        for (int i = 0; i < secondWordLength; i++) {
            secondStack.push(word2.charAt(secondWordLength - i - 1));
        }

        for (int i = 0; i < Math.min(firstWordLength, secondWordLength); i++) {
            sb.append(firstStack.pop());
            sb.append(secondStack.pop());
        }

        Stack tempStack = new Stack();

        if(!firstStack.isEmpty()){
            tempStack = firstStack;
        }

        if(!secondStack.isEmpty()){
            tempStack = secondStack;
        }

        while (!tempStack.isEmpty()) {
            sb.append(tempStack.pop());
        }

        return sb.toString();
    }
}