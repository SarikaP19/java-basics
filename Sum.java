class Sum
{
    public static void findPair(int[] nums, int target)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
 
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = {1,14,8,54,23,13,20,45,90};
        int target = 21;
 
        findPair(nums, target);
    }
}
