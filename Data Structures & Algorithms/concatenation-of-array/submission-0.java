class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int resultArr[]= new int[len*2];

        for(int i=0; i<len*2; i++){
            resultArr[i] = nums[i%len];
            }
    return resultArr;
    }
}