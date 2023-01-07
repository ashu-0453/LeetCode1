class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int mid;
        while(s<=e){
            mid=e-(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else
            s=mid+1;
        }
      return s;  
    }
    
}

