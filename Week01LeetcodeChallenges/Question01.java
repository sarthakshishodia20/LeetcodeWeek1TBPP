import java.util.Scanner;

public class Question01{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        obj.close();
        boolean ans=isSorted(a);
        System.out.println(ans);
    }
    public static boolean isSorted(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;
            }
        }
        return count<=1;
    }
}