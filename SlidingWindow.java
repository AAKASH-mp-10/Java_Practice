// 209,3


//2461
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        int left = 0;
        Set<Integer> windowElements = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            while (windowElements.contains(nums[right])) {
                currentSum -= nums[left];
                windowElements.remove(nums[left]);
                left++;
            }

            windowElements.add(nums[right]);
            currentSum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                
                currentSum -= nums[left];
                windowElements.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
    }
}


//643
import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        //double avg=maxsum/k;
        return maxsum/k;
    }
}



//209
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minVal = Integer.MAX_VALUE; 

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            while (sum >= target) {
                minVal = Math.min(minVal, (right - left) + 1);
                sum -= nums[left];
                left++;
            }
        }
        
        return minVal == Integer.MAX_VALUE ? 0 : minVal;
    }
}