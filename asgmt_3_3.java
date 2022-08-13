public class asgmt_3_3 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1, diff = 0, sum = 0, res = nums[0]+nums[1]+nums[2];

        for(int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    
                    sum = nums[i] + nums[j] + nums[k];
                    System.out.printf("%d + %d + %d = %d\n", nums[i], nums[j], nums[k], sum);
                    
                    if (sum < 0)
                        diff = target + (-1 * sum);

                    else{
                        if (sum > target)
                            diff = sum - target;
                        else if (sum == target)
                            diff = sum;
                        else
                            diff = target - sum;
                    }
                    
                    if (res > diff)
                        res = diff;
                }
            }
        }
        System.out.println("\nClosest = " + diff);
    }
}