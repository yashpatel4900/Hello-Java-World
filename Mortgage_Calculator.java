import java.util.*;
import java.lang.*;
import java.text.NumberFormat;

public class Mortgage_Calculator {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Annual Interest Rate: ");
        double interest = sc.nextDouble();
        double month_interest = interest / (100*12);
        System.out.println("Period Years: ");
        double time = sc.nextDouble();
        time = time*12;

        double mortgage = (principal*(month_interest*Math.pow((1 + month_interest), time))) / (Math.pow((1 + month_interest), time) - 1);
        
        NumberFormat curreny = NumberFormat.getCurrencyInstance();
        String result = curreny.format(mortgage);
        System.out.println("Mortgage: "+ result);
    }
    
}