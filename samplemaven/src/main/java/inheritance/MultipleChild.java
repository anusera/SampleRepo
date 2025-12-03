package inheritance;

public class MultipleChild implements MultipleParent1, MultipleParent2{

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.display();
		obj.print();

	}

	@Override
	public void print() {
		System.out.println("From print Method from Parent2");
		
	}

	@Override
	public void display() {
		System.out.println("From display Method from Parent1");		
	}

}
