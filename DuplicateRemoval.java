import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static int removal(int arr[], int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int[] temp = new int[n];
    int j = 0;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        temp[j++] = arr[i];
      }
    }
    temp[j++] = arr[n - 1];

    for (int i = 0; i < j; i++) {
      arr[i] = temp[i];
    }
    return j;
  }

  public static void main(String[] args) {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size: ");
    int arr_size = sc.nextInt();
    int[] arr = new int[arr_size];
    System.out.println("Read Array Elements from users: ");
    for (i = 0; i < arr_size; ++i) {
      System.out.print("Enter element of index " + i + " : ");
      arr[i] = sc.nextInt();
    }

    System.out.println("Array before removing duplicate element is: ");
    for (i = 0; i < arr_size; i++) {
      System.out.print(arr[i] + " ");
    }
    Arrays.sort(arr);
    int length = arr.length;
    length = removal(arr, length);

    System.out.println("\nUnique Array is: ");
    for (i = 0; i < length; ++i) {
      System.out.print(arr[i] + " ");
    }
  }
}
