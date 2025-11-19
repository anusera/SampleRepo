package inheritance;

public class HierarchialChild1 extends HierarchialParent {
	public void displayChild1()
	{
		System.out.println("From Hierarchial Child1 class");
	}

	public static void main(String[] args) {
		HierarchialChild1 obj = new HierarchialChild1();
		obj.display();
		obj.displayChild1();

	}

}
