package oopProject;

import java.util.Scanner;

public class oopProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int number = input.nextInt();

		if(number>=1&&number<=15)
		{
			for (int rows = 1; rows <= number; rows++) {
				for (int s = number - rows; s >= 1; s--) {
					System.out.print("   ");
				}
				for (int l = rows; l >= 2; l--) {
					if(l>=10)
						System.out.print(l + " ");
					else
						System.out.print(l + "  ");
				}
				for (int r = 1; r <= rows; r++) {
					if(r>=9)
						System.out.print(r + " ");
					else
						System.out.print(r + "  ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("wrong number");
	}
}
