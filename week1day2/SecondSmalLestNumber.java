package week1day2;

public class SecondSmalLestNumber {
	public static void main(String[] args) {
        int[] array = {23, 45, 67, 32, 89, 22};

        int smallest = Integer.MAX_VALUE; // Initialize smallest as a high value
        int secondSmallest = Integer.MAX_VALUE; // Initialize secondSmallest as a high value

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest; // Update secondSmallest
                smallest = num; // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num; // Update secondSmallest
            }
        }

        System.out.println("The second smallest number is: " + secondSmallest);
    }


}
