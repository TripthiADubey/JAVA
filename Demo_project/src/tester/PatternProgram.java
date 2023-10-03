package tester;
import java.util.*;
public class PatternProgram {
	int val=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		//System.out.println(args);
		//System.out.println(methd());
		
		
		int a=5,b=10,c;
		char x=63;
		System.out.println(c=a+b);
		System.out.println(--x);
		
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Patterns pt=new Patterns();
		pt.diamond(n);
	}
	private static int methd() {
		System.out.println("Hello By method");
		return 1;
	}
	
	
}

class Patterns{
	protected void trileft(int n) {
		n++;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	protected void triright(int n) {
		n++;
		for(int i=0;i<n;i++) {
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");

			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	protected void triinvleft(int n) {
		n++;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=n-i-1;j>-1;j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	
	}
	protected void triinvright(int n) {
		n++;
		for(int i=0;i<n;i++) {
			
			for(int j=n-i-1;j>-1;j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	
	}
	protected void diamond(int n) {
		/*
		triright(n);
		trileft(n);
		triinvleft(n);
		triinvright(n);
		*/
		n++;
		for(int i=0;i<n;i++) {
			//upper left
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");

			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			//upper right
			for(int j=0;j<i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//mid
		for(int i=1;i<n*2;i++) {
			System.out.print("*");
			
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			
			//lower lft
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			
			for(int j=n-i-1;j>0;j--) {
				System.out.print("*");

			}
			//lower right
			for(int j=n-i-2;j>0;j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	protected void trieq(int n) {
		
		n++;
		for(int i=0;i<n;i++) {
			//n*space
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");

			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
