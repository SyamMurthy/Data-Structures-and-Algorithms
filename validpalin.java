import java.util.*;
import java.util.Scanner;
class validpalin
{
    public static boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0;
        int r=s1.length()-1;
        while(l<=r)
        {
            if(s1.charAt(l)==s1.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean result=isPalindrome(s);
        System.out.println(result);
       } 
    
}
