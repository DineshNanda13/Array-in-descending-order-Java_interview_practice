# Array-in-descending-order-Java_interview_practice
Java program to sort the array in descending order
package descending;

/**
 *
 * @author Dinesh Nanda
 */

public class ArrayInDescending {

    public static void main(String[] args) {
        
        int arr[] = {5, 2, 8, 7, 1};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in descending order is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
