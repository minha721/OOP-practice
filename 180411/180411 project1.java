import java.util.Scanner;

class Linear {
	private double a,b,c,d,e,f;

	public Linear(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if((a*d-b*c)!=0)
			return true;
		else
			return false;
	}
	
	public double getX() {
		return ((e*d-b*f)/(a*d-b*c));
	}
	
	public double getY() {
		return ((a*f-e*c)/(a*d-b*c));
	}
}

public class LinearEquation {
	public static void main(String[] args) {
		System.out.print("input a to f : ");
		Scanner input=new Scanner(System.in);
		double aa=input.nextDouble();
		double bb=input.nextDouble();
		double cc=input.nextDouble();
		double dd=input.nextDouble();
		double ee=input.nextDouble();
		double ff=input.nextDouble();
		
		Linear l=new Linear(aa,bb,cc,dd,ee,ff);
		
		if(l.isSolvable()==true) {
			System.out.println("x : "+l.getX());
			System.out.println("y : "+l.getY());
		}
		else
			System.out.println("The equation has no solution");
	}
}

