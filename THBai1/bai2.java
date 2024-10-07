
import java.util.Scanner;


public class bai2 {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swap;
        int step = 0;

        for (int i = 0; i < n - 1; i++) {
            swap = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap) {
                step++;
                System.out.print("Buoc " + step + ": ");
                printArr(arr);
            }

            if (!swap) {
                break;
            }
        }
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);
        scanner.close();
    }
}