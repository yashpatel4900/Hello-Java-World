import java.lang.*;
import java.util.*;

public class FizzBuzz {
    public static void main( String args[] ){
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        } else {
            if (number % 5 == 0){
                System.out.println("Fizz");
            } else if(number % 3 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(number);
            }
        }
    }
}