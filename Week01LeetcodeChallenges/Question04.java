import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        move(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void move(int[] nums){
        int nonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZero]=nums[i];
                nonZero++;
            }
        }
        while(nonZero<nums.length){
            nums[nonZero++]=0;
        }
    }
}
