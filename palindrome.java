import java.util.*;
import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean result=isPalindrome(a);
        System.out.println(result);
       }
    public static boolean isPalindrome(int x) 
        {
            int ans=x;
            int rev=0;
            while(x>0)
            {
                int ld=x%10;
                rev=rev*10+ld;
                x/=10;
            }
            return (rev==ans);
        }
    }

    
