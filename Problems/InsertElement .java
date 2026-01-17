import java.util.Scanner;

public class InsertElement{
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        int[] newArr = new int[n + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Array after insertion:");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
