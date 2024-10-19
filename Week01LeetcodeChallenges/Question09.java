import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        obj.close();
        sortColors(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        while (middle <= end) {
            switch (nums[middle]) {
                case 0: {
                    swap(nums, start, middle);
                    start++;
                    middle++;
                    break;
                }
                case 1: {
                    middle++;
                    break;
                }
                case 2: {
                    swap(nums, middle, end);
                    end--;
                    break;
                }
            }
        }
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
