package oopPj;

public class oopPj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; // emirp 수의 개수
		int i=1; // 판단하려는 수
		while(num<=200) {
			if(isEmirp(i)==true&&oopPj.isPalindrome(i)==false) {
				System.out.print(i+" ");
				if(num%10==0)
					System.out.print("\n");
				num++;
				i++;
			}
			else
				i++;
		}
	}
	
	public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) {
	        return false;
	      }
	    }
	    return true;
	}
	
	public static boolean isEmirp(int number) {
		if(isPrime(oopPj.reverse(number))==true&&isPrime(number)==true)
			return true;
		else
			return false;
	}
}
