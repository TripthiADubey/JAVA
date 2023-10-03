package test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(1==i) {
			System.out.println("Enter your Choice");
			System.out.println("1) Dot Matrix Printer\n2) InkJet Printer\n3) EXIT\n");
			int choice= sc.nextInt();
			switch(choice) {
				case 1:{
					Printer prt1 = new DotMatrix();
					prt1.display();
					prt1.config();
					break;
				}
				case 2:{
					Printer prt1 = new InkJet();
					prt1.display();
					prt1.config();
					break;
				}case 3:{
					i=3;
					break;
					
					
				}
			}
		}
	}

}
