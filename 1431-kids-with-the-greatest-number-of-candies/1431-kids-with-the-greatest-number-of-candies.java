class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = Arrays.stream(candies).max().getAsInt();

        List<Boolean> answer = new ArrayList<>();
        int targetCandy = maxCandie - extraCandies;

        for (int candy : candies) {
            if (candy >= targetCandy) answer.add(true);
            else answer.add(false);
        }

        return answer;
    }
}