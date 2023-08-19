package week1day2;

public class CheckPalindrome {
	public static void main(String[] args) {
        int num = 34343;
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number using a for loop
        for (reversedNum=0; num != 0; num /= 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }
        
        
        // Check if the reversed number is equal to the original number
       if (reversedNum == originalNum) {
          System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }   
	
	
}
}



