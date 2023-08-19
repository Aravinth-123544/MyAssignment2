package week1day2;

public class FibonacciSeries {
	 public static void main(String[] args) {
	        int range = 8; // Set the range for the series
	        int firstNum = 0; // First number of the series
	        int secNum = 1; // Second number of the series
	        
	        System.out.print(firstNum + ", "); // Print the first number
	        
	        for (int i = 1; i < range; i++) {
	            int sum = firstNum + secNum; // Calculate the sum of the previous two numbers
	            System.out.print(sum + ", "); // Print the sum
	            
	            firstNum = secNum; // Update the first number with the value of the second number
	            secNum = sum; // Update the second number with the sum
	        }
	    }

}
