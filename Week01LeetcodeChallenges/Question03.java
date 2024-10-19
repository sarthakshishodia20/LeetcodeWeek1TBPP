import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        rotate(arr, k);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
        }

       public static void reverseNum(int[] nums,int start,int end){
           while(start<end){
               int temp=nums[start];
               nums[start]=nums[end];
               nums[end]=temp;
               start++;
               end--;
           }
       }
}
