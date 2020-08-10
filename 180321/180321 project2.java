package oopProjectt;

import java.util.Scanner;

public class oopProjectt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumCom=0;
		int sumUser=0;
				
		while(sumCom-sumUser<2&&sumUser-sumCom<2) {
			int com=(int)(Math.random()*3);
			
			if(com==0)
				System.out.println("Computer is scissor.");
			else if(com==1)
				System.out.println("Computer is rock.");
			else
				System.out.println("Computer is paper.");
			
			System.out.print("scissor(0), rock(1), paper(2) : ");
			Scanner input = new Scanner(System.in);
			int user = input.nextInt();
			
			if(com==0) {
				if(user==0)
					System.out.println("tie");
				else if(user==1) {
					System.out.println("You won");
					sumUser++;
				}
				else {
					System.out.println("Computer won");
					sumCom++;
				}
			}
			
			else if(com==1) {
				if(user==0) {
					System.out.println("Computer won");
					sumCom++;
				}
				else if(user==1)
					System.out.println("tie");
				else {
					System.out.println("You won");
					sumUser++;
				}
			}
				
			else {
				if(user==0) {
					System.out.println("You won");
					sumUser++;
				}
				else if(user==1) {
					System.out.println("Computer won");
					sumCom++;
				}
				else
					System.out.println("tie");
			}
		}
		
		if(sumUser>sumCom)
			System.out.println("You won more than two times");
		else if(sumCom>sumUser)
			System.out.println("Computer won more than two times");
	}
}
