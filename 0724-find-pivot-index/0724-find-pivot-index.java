class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            totalSum += nums[i];
        }
        
        if(totalSum - nums[0] == 0) return 0;
        
        for (int pivot = 1; pivot < len; pivot++) {
            leftSum += nums[pivot-1];
            if(leftSum*2 +nums[pivot] == totalSum) return pivot;
        }
        return -1;
    }
}