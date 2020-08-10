import java.util.Scanner;

public class LinearEquation2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input (x1,y1) : ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.print("Input (x2,y2) : ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		System.out.print("Input (x3,y3) : ");
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		System.out.print("Input (x4,y4) : ");
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		
		double a=y2-y1;
		double b=x1-x2;
		double c=y4-y3;
		double d=x3-x4;
		double e=x1*y2-x2*y1;
		double f=x3*y4-x4*y3;
		
		Linear l=new Linear(a,b,c,d,e,f);
		
		if(l.isSolvable()==true) {
			System.out.println("x : "+l.getX());
			System.out.println("y : "+l.getY());
		}
		else
			System.out.println("The equation has no solution");
	}

}
