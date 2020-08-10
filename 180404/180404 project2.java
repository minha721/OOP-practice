package projectt5;

import java.util.Scanner;

public class projectt5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	      System.out.print("Enter the number of elements: ");
	      int n = input.nextInt();
	      int[] list = new int[n];
	      
	      System.out.print("Enter a list: ");
	      for(int i=0; i<list.length; i++)
	         list[i] = input.nextInt();
	      partition(list);
	      
	      System.out.print("After the partition, the list is ");
	      for(int i=0; i<list.length; i++)
	         System.out.print(list[i] + " ");
	   }
	   
	   public static int partition(int[] list) {
	      int i=1, j=list.length-1, a;
	      
	      while(true){
	         if(list[0]<list[i]) {
	            while(i!=j) {
	               if(list[0]>=list[j]) {
	                  a = list[i];
	                  list[i] = list[j];
	                  list[j] = a;
	                  break;
	               }
	               j--;
	            }
	         }
	         
	         if(i==j) {
	            if(list[0]>list[i]) {
	               a = list[0];
	               list[0] = list[i];
	               list[i] = a;
	               break;
	            }
	            a = list[0];
	            list[0] = list[i-1];
	            list[i-1] = a;
	            break;
	         }
	         i++;
	      }
	      return i;
	   }
}
