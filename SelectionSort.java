import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    selectionSort(arr, n);
    System.out.println("Sorted array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }

  static void selectionSort(int[] arr, int n) {
    int minIndex, temp;
    for (int i = 0; i < n - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < n; j++) {
        switch (arr[j] < arr[minIndex]) {
          case true:
            minIndex = j;
            break;
          case false:
            break;
        }
      }
      temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}
