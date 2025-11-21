package accessmodifiers;

public class Access1 {
	public void publicDisplay()
	{
		System.out.println("Public Method");
	}
	
	private void privateDisplay()
	{
		System.out.println("Private Method");
	}
	
	protected void protectedDisplay()
	{
		System.out.println("Protected Method");
	}
	
	void defaultDisplay()
	{
		System.out.println("Default Method");
	}




	public static void main(String[] args) {
		
		Access1 obj = new Access1();
		obj.defaultDisplay();
		obj.privateDisplay();
		obj.protectedDisplay();
		obj.publicDisplay();
		
	}

}
