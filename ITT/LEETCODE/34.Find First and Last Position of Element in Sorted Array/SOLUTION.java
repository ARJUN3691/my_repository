class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        int start=binary(nums,target,true);
        int end=binary(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    int binary(int[]nums,int target,boolean first)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target==nums[mid])
            {
                ans=mid;
                if(first)
                {
                   end=mid-1; 
                }
                else
                {
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
