package encapsulation;

public class Encap {

	private String name;
	private int age;
	
	public void setter(String name, int age)
	{
	this.name = name;
	this.age = age;
	}
	
	public void getter()
	{
		System.out.println(name + " "+ age);
	}
	public static void main(String[] args) {
		

	}

}
