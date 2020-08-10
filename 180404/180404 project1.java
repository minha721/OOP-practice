package project5;

import java.util.Scanner;

public class project5 {
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		int[] number=new int[10];
		
		for(int i=0;i<number.length;i++) {
			number[i]=input.nextInt();
		}
		
		sort(number);
		
		for(int i=0;i<number.length;i++)
			System.out.print(number[i]+" ");
	}
	
	public static void sort(int[] number) {
		int check=0;
		int a=0;
		
		for(int i=1; i<number.length; i++) {
			for(int j=0; j<number.length-1; j++) {
				if(number[j]>number[j+1]) {
					a=number[j];
					number[j]=number[j+1];
					number[j+1]=a;
				}
				else check++;
			}
			
			if(check==number.length-1)
				break;
			else
				check=0;
		}
	}
}