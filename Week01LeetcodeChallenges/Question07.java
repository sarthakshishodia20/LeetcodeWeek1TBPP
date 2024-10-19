import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        int ans=singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        int unique=nums[0];
        for(int i=1;i<nums.length;i++){
            unique=unique^nums[i];
        }
        return unique;
    }
}
