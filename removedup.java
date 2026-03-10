import java.util.*;
import java.util.Scanner;
class removedup{
    public static  int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int result=removeDuplicates(nums);
        System.out.println(result);
       } 
    }