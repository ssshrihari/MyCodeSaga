public class LargNumTwiceOfOthers {
    class Solution
    {
        public int dominantIndex(int[] nums) {
            if(nums.length == 1)
                return 0;
            int max = 0, secondMax=0;
            int indexOfMax = -1;
            for(int i=0;i<nums.length;i++){
                if(nums[i] > max ){
                    secondMax = max;
                    max = nums[i];
                    indexOfMax = i;
                }
                if(nums[i]>secondMax){
                    if(nums[i]<max)
                        secondMax = nums[i];
                }
            }
            if(secondMax*2<=max)
                return indexOfMax;
            return -1;
        }
    }
    public static void main(String[] args) {

    }
}
