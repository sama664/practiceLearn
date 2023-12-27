import java.util.ArrayList;
import java.util.List;

public class MaximumAvg {
    public static void main(String[] args) {
        MaximumAvg maximumAvg= new MaximumAvg();
        int nums[]= {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(maximumAvg.findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i ++)
            sum += nums[i];
        int maxSum = sum;
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }
}
