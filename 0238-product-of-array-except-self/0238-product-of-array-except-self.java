import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 0 2개이상 제외
        int[] answer = new int[nums.length];
        int zeroCount = 0;
        int productValue = 1;

        for (int num : nums) {
            if (num == 0) ++zeroCount;
        }

        if (zeroCount > 1) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = 0;
            }
        }

        // 0 1개일때
        if (zeroCount == 1) {
            int targetIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    targetIndex = i;
                }
            }
            Arrays.fill(answer, 0);
            for (int i = 0; i < nums.length; i++) {
                if(i == targetIndex) continue;
                productValue *= nums[i];
            }
            answer[targetIndex] = productValue;
        }
        // 0 0개일때
        if (zeroCount == 0) {
            for (int i = 0; i < nums.length; i++) {
                productValue *= nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = productValue / nums[i];
            }
            answer = nums;
        }

        return answer;
    }
}