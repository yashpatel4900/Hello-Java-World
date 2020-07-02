import java.util.*;
import java.lang.*;
import java.text.NumberFormat;

public class Mortgage_Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double principal;
        while (true) {
            System.out.println("Principal ($1k- $1M): ");
            principal = sc.nextDouble();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter valid value");
        }

        double interest;
        double month_interest;
        while (true) {
            System.out.println("Annual Interest Rate: ");
            interest = sc.nextDouble();
            month_interest = interest / (100 * 12);
            if (interest >= 1 && interest <= 30)
                break;
            System.out.println("Enter valid value");
        }

        double time;
        while (true) {
            System.out.println("Period Years: ");
            time = sc.nextDouble();
            if (time >= 1 && time <= 30)
                break;
            System.out.println("Enter valid value");
        }
        
        time = time * 12;

        double mortgage = (principal * (month_interest * Math.pow((1 + month_interest), time)))
                / (Math.pow((1 + month_interest), time) - 1);

        NumberFormat curreny = NumberFormat.getCurrencyInstance();
        String result = curreny.format(mortgage);
        System.out.println("Mortgage: " + result);
    }

}