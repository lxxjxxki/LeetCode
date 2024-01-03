class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = Arrays.stream(candies).max().getAsInt();

        List<Boolean> answer = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandie) {
                answer.add(true);
                continue;
            }
            answer.add(false);
        }

        return answer;
    }
}