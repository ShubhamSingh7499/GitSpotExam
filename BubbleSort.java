import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    bubbleSort(arr, n);
    System.out.println("Sorted array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }

  static void bubbleSort(int[] arr, int n) {
    int temp;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        switch (arr[j] > arr[j + 1]) {
          case true:
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            break;
          case false:
            break;
        }
      }
    }
  }
}
