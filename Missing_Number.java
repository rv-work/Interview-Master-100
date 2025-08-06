class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int num : nums) sum += num;
        int req = (n*(n+1))>>1;
        return req-sum;
    }
}