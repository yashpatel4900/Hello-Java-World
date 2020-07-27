import java.lang.*;
import java.util.*;

public class ClassWork {
    public static void main(String args[]) {
        // System.out.println("Enter amount to convert to dollar: ");
        // Scanner sc = new Scanner(System.in);
        // float rupees = sc.nextFloat();
        // float dollar = rupees / 60;
        // System.out.println(dollar + " Dollar is equala to "+ rupees + " Rupees.");

        // Scanner sc = new Scanner(System.in);
        // int[] marks= new int[6];
        // float sum=0;
        // float percentage=0;
        // System.out.println("Enter Total marks of Question paper: ");
        // float total_marks = sc.nextInt();
        // total_marks *= 6;
        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("Enter marks scored by student in subject" + i + ": ");
        //     marks[i] = sc.nextInt();
        //     sum = sum +marks[i];
        //     // percentage = (sum / total_marks)*100 ; 
        // }
        // percentage = ((float)(sum / total_marks))*100 ; 
        // System.out.println("Student obtained "+ percentage +"%");
        

        System.out.println("Enter first number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Add: " + (a+b));
        System.out.println("Sub: "+ (a-b));
        System.out.println("Multi: "+ (a*b));
        System.out.println("Division: " + (float)((float)a/b));
    }

}