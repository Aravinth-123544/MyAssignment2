package week1day2;

public class FindFirstMissingElementInAnArray {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 6, 8};

       
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the iterator variable is not equal to the array value
            if (i + 1 != arr[i]) {
                System.out.println(i + 1); // Print the missing number
                break; // Break the loop once the missing number is found
            }
        }
    }







}
