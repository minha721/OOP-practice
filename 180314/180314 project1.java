package project;

import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer between 0 and 1000 : ");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		if(number<0)
			System.out.println("Wrong number");
		else if(number>=0&&number<10)
			System.out.println("The multiplication of all digits in " + number + " is " + number);
		else if(number>=10&&number<100) {
			int a=number/10;
			int b=number%10;
			System.out.println("The multiplication of all digits in " + number + " is " + (a*b));
		}
		else if(number>=100&&number<1000) {
			int c=number/100; //백의 자리
			int d=number%100;
			int e=d/10; //십의 자리
			int f=number%10; //일의 자리
			System.out.println("The multiplication of all digits in " + number + " is " + (c*e*f));
		}
		else if(number==1000)
			System.out.println("The multiplication of all digits in " + number + " is 0");
		else
			System.out.println("Wrong number");
	}

}
