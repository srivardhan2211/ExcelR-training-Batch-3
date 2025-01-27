public class LTcode006 {
    public static void main(String[] args) {
        LTcode006 solution = new LTcode006();
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        System.out.println("Non-duplicate values: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int x = 1; x < nums.length; x++) {
            if (nums[x] != nums[x - 1]) {
                nums[k] = nums[x];
                k++;
            }
        }
        return k;
    }
}


