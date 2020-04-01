public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
        int start=0;
        int helper=0;
        while(helper<nums.length){ //stop when find the last non-zero number the first pointer can exchange with
            while(start<nums.length&&nums[start]!=0){
                start++;
            }
            helper=start+1;
            while(helper<nums.length&&nums[helper]==0){
                helper++;
            }
            if(start<nums.length&&helper<nums.length){
                nums[start]=nums[helper];
                nums[helper]=0;
                start++;
            }
        }
    }
    
    
}
