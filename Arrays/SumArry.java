// Java Program to Add (Sum) All Elements of an Array
// Logic:
// Take a variable sum = 0
// Traverse array and keep adding values

package Arrays;

public class SumArry {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
    
}
