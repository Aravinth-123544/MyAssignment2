package week1day2;

public class PrimeNumber {
	public static void main(String[] args) {
        int input = 13; // Declare an int input and assign a value 13
        boolean flag = false; // Declare a boolean variable flag as false

        // Iterate from 2 to half of the input
        for (int i = 2; i <= input / 2; i++) {
            // Divide the input by each value of the loop variable and check the remainder
            if (input % i == 0) {
                flag = true; // Set the flag as true when there is no remainder
                break; // Break the loop
            }
        }

        // Check the flag
        if (!flag) {
            System.out.println(input + " is a Prime Number"); // Print 'Prime'
        } else {
            System.out.println(input + " is Not a Prime Number"); // Print 'Not a Prime'
        }
    }
}


