public class LargestOnes {
    public static void main(String[] args) {
        LargestOnes largestOnes= new LargestOnes();
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(largestOnes.longestOnes(nums,k));
    }
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int right=0;
        int left = 0;
        int ans = 0;

        while(right < n) {
            if(nums[right]==0) {
                count++;
            }

            while(count > k) {
                if(nums[left]==0) {
                    count--;
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }

}
