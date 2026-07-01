class Solution {
    public int removeElement(int[] nums, int val) {
        int nextIndex = 0;
        int arr[]= new int [nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[nextIndex]=nums[i]; //
                nextIndex++;
            }
        }
        for(int num: arr){
            System.out.println(num+" ");
        }
        return nextIndex;
    }
}