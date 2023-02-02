import java.util.Scanner;

public class InsertionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    insertionSort(arr, n);
    System.out.println("Sorted array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }

  static void insertionSort(int[] arr, int n) {
    int key, j;
    for (int i = 1; i < n; i++) {
      key = arr[i];
      j = i - 1;
      while (j >= 0) {
        switch (arr[j] > key) {
          case true:
            arr[j + 1] = arr[j];
            j = j - 1;
            break;
          case false:
            break;
        }
        arr[j + 1] = key;
      }
    }
  }
}
