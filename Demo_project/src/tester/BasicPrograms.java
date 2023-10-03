package tester;

import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Basic a = new Basic();
		System.out.println("Factorial :"+a.factorial(n));

	}

}
class Basic{
	public int factorial(int n) {
		int ans=1;
		for(int i=1;i<n;i++) {
			ans*=i;
		}
		return ans;
	}
}
