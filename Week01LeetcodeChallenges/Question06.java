import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = obj.nextInt();
        }
        obj.close();
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxone = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxone = Math.max(count, maxone);
            } else {
                count = 0;
            }
        }
        return maxone;
    }
}
