package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
	String s;
	public void print()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
	public void display()
	{
		super.display();
		System.out.println("From child method");
	}
	
	public SuperVariableChild()
	{
		super();
		s= "Purple";
	}


	public static void main(String[] args) {
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();
		obj.display();
		

	}

}
