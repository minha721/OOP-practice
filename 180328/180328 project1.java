package oopPj;

import java.util.Scanner;

public class oopPj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=input.nextInt();
		
		if(isPalindrome(num)==true)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");
			
	}
	
	public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10; // is ignored first iteration
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
	
	public static boolean isPalindrome(int number) {
		if(number==reverse(number))
			return true;
		else
			return false;
	}
}