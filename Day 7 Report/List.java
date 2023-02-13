import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }
            else{
                int toRemove = sc.nextInt();
                list.remove(toRemove);
            }
        }
        int length = list.size();
        for(int i = 0; i < length; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
