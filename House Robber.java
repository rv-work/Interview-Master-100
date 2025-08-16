class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
         if(n == 1) return nums[0];
         if(n == 2) return Math.max(nums[0] , nums[1]);
         
         dp[0] = nums[0];
         dp[1] =  Math.max(nums[0] , nums[1]);
         
         for(int i=2; i<n; i++){
            dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]);
         }

         return dp[n-1];
    }

    // int ans(int index , int[] nums , int [] dp){
    //     if(index == 0) return nums[0];
    //     if(index == 1) return Math.max(nums[0] , nums[1]);

    //     if (dp[index] != 0) return dp[index];

    //     return dp[index] = Math.max(nums[index] + 
    //     ans(index-2 , nums , dp)  ,ans(index-1 , nums , dp) );
    // }
}


















