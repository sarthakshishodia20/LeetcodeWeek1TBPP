import java.util.Scanner;
public class Question08 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int target=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        int[] ans=twoSum(arr,target);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
    public static  int[] twoSum(int[] nums, int target) {
        int[] array=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    array[0]=i;
                    array[1]=j;
                }
            }    
        }
        return array;
       }
}
