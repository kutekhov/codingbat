public class makeLast {
    public int[] makeLast(int[] nums) {
        int[] arr = new int[2 * nums.length];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }
}
