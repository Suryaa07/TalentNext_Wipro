import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        scanner.close();
        
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(a);
       NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n1.format(a);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(a);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(a);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
