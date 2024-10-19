import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=obj.nextInt();
        }
        obj.close();
        int ans=missingNumber(nums);
        System.out.println(ans);
    }
       public static int missingNumber(int[] nums) {
            int xor=nums.length;
            for(int i=0;i<nums.length;i++){
                xor=xor^i;
                xor=xor^nums[i];
            }
            return xor;
        }
}
