import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         boolean palindrome = true;
        
        for(int i = 0; i<a.length()/2;i++)
        {
            if(!a.substring(i,i+1).equals(a.substring(a.length()-i-1,a.length()-i)))
            {
                palindrome = false;
            }
        }
        if(palindrome){System.out.println("Yes");}
        else{System.out.println("No");}
        
     }
}
