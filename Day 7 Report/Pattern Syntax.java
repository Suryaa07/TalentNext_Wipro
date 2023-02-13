import java.util.Scanner;
import java.util.regex.*;

public class Solution
{

        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        while(a>0){
            try{
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }finally{
                a--;
            }           
        }
        in.close();
}}
