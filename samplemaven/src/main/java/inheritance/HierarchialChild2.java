package inheritance;

public class HierarchialChild2 extends HierarchialParent{
	public void displayChild2()
	{
		System.out.println("From Hierarchial Child2 class");
	}

	public static void main(String[] args) {
		HierarchialChild2 obj = new HierarchialChild2();
		obj.display();
		obj.displayChild2();

	}

}
