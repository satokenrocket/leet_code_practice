class Solution {
    public int searchInsert(int[] nums, int target) {
        int  low = 0;
        int hihgh = nums.length - 1;
        int middle = (low + hihgh)/2;
        
        while (low <= hihgh){
            middle = (low + hihgh)/2;
            if (nums[middle]==target ){
                break;
            }else if(nums[middle] < target){
                low = middle + 1;
            }else{
                hihgh = middle - 1;
            }
        }
        
//         if (middle<target){
//             middle=middle+1;
//         }else if (middle>target){
//             middle=middle-1;
//         }
        
        if (middle>target){
            middle=middle-1;
        }
        
        
        return middle;
    }
}