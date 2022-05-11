//link : https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul=1,c=0;
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0)
                mul*=nums[i];
            else
                c++;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0 && c==0)
                arr[i] = mul/nums[i];
            else if(nums[i]==0 && c==1)
                arr[i] = mul;
            else
                arr[i] = 0;
        }
        return arr;
    }
}
