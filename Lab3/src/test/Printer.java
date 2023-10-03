package test;

public abstract class Printer {
	public abstract void display();

	public abstract void config();

}



class DotMatrix extends Printer {
	public void display(){
		System.out.println("This is a Dot Matrix Printer");
	}

	public void config() {
		System.out.println("Dot Matrix Printer Resolution  ; 920 * 700px");

	}

}




class InkJet extends Printer {
	public void display(){
		System.out.println("This is a InkJet Printer");
	}

	public void config() {
		System.out.println("InkJet Printer Resolution  ; 3660 * 2840px");

	}

}
