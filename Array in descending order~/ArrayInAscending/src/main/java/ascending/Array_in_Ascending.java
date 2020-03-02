package ascending;

/**
 *
 * @author Dinesh Nanda
 */
public class Array_in_Ascending {

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 7, 1};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in Ascending order is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
