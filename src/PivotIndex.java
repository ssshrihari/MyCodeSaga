/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
Constraints:

1 <= nums.length <= 104
-1000 <= nums[i] <= 1000


 */
public class PivotIndex {
    class Solution{
        public int sumOfArray(int arr[]){
            int i =0,sum=0;
            while(i<arr.length) sum+=arr[i++];
            return sum;
        }
        public int pivotIndex(int[] nums) {
            int leftSum = 0;
            int sum = sumOfArray(nums);
            for(int i = 0;i < nums.length ; i++){
                if(leftSum == sum - leftSum - nums[i])
                    return i;
                leftSum += nums[i];
            }
            return -1;
        }
    }
    public static void main(String[] args) {

    }
}
