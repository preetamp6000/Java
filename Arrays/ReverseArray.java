// Java Program to Print Array Elements in Reverse Order
// Logic:
// Arrays are 0-indexed
// Last index = length - 1
// Loop from last index to 0



public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array in reverse order:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
