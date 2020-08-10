package projecttt5;

import java.util.Scanner;

public class projecttt5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] list = new int[8][7];
		int[] hour = new int[8];
		int[] order = {0, 1, 2, 3, 4, 5, 6, 7};
		
		for(int i=0; i<list.length; i++)
			for(int j=0; j<list[i].length; j++)
				list[i][j] = input.nextInt();
		
		sum(list, hour);
		sort(hour, order);
		
		for(int k=order.length-1; k>=0; k--) {
			System.out.print("Employee " + order[k] + ":" + hour[k] + "\n");
		}

	}
	
	public static void sum(int[][] list, int[] hour) {
		for(int i=0; i<hour.length; i++)
			for(int j=0; j<list[i].length; j++)
				hour[i] += list[i][j];
	}
	
	public static void sort(int[] hour, int[] order) {
		int a, check = 0;
		
		for(int i=1; i<hour.length; i++) {
			for(int j=0; j<hour.length-1; j++) {
				if(hour[j]>hour[j+1]) {
					a = hour[j];
					hour[j]=hour[j+1];
					hour[j+1] = a;
					
					a = order[j];
					order[j]=order[j+1];
					order[j+1] = a;
				}
				else check++;
			}
			if(check == hour.length-1) break;
			else check = 0;
		}
	}
}
