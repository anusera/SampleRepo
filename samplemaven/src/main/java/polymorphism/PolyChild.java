package polymorphism;

public class PolyChild extends PolyParent{
	public void print (int a, int b)
	{
		System.out.println(a-b);
		super.print(4, 5);
	}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.print(10, 5);
		

	}

}
