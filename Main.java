import java.util.*;
import java.lang.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;

class Main {
    public static void main(String args[]) {
        System.out.println("Hello World");
        // byte age= 30;
        // System.out.println(age);
        // Date now= new Date();                                     //Current Date
        // System.out.println(now);      


        // Point point1 = new Point();
        // point1.x=1;
        // point1.y=1;                                                  //Pointers
        // Point point2= point1;
        // point1.x=2;
        // System.out.println(point2.x);

        // String message = "Hello World" + "!!";
        // System.out.println(message.endsWith("!!"));
        // System.out.println(message.indexOf("er"));
        // System.out.println(message.replace("!", "*"));                   //This does not change original string
        // System.out.println(message.trim());
        // System.out.println("Hello \"Yash\" ");

        // int[] numbers = new int[5];                                       //Array
        // numbers[0] = 1;
        // numbers[1] = 2;

        // int[] numbers = { 5, 1, 4, 3, 5};
        // System.out.println(numbers.length);
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));

        // int[][] numbers = {{1,2,3},{1,2,3}};                              //Multidimensional Array
        // System.out.println(Arrays.deepToString(numbers));

        // final float PI = 3.14F;   //To declare constant
        // System.out.println(PI);

        // float result = 10.00F / 3;
        // double result1 = (double) 10 / (double) 3;                          //Explicit
        // System.out.println(result);
        // System.out.println(result1);

        // int x=1;                                            //Increment
        // x++;                                                // Order of Operators: () * / + -
        // System.out.println(x);
         
        // short x= 1 ;                                                  // Implicit Casting                     
        // int y = x + 2;                                               // byte > short > int > long > float > double
        // System.out.println(y);

        // float x1 = 1.1F;                                              // Explicit Casting
        // int y1 = (int) x1 + 2;
        // System.out.println(y1);

        // int result = Math.round( 1.1F );
        // int result = (int)Math.ceil( 1.1F );                                  //Math Functions
        // int result = Math.max(1,2);
        // double result = Math.random();
        // int result = (int) Math.round(Math.random()*100);
        // System.out.println(result);

        // NumberFormat curreny = NumberFormat.getCurrencyInstance();        //Currency
        // String result = curreny.format(1234567.891);
        // System.out.println(result);

        // String result = NumberFormat.getPercentInstance().format(0.1);     //F2 to rename all at a time
        // System.out.println(result);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Value of A: ");                       //Input using Scanner class
        // int a = sc.nextInt();
        // System.out.println("Enter Name: "); 
        // String name = sc.next().trim();
        // System.out.println("You are " + name);   
        // System.out.println("Value of A entered is: " + a);

        // int income =120_000;
        // String className = income > 100_000 ? "First" : "Second";      //Ternary Operator
        // System.out.println(className);

        System.out.println("Enter Role (admin/moderator): ");
        Scanner sc = new Scanner(System.in);
        String role = sc.next();
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default :
                System.out.println("You're a guest");
        }
    }
}