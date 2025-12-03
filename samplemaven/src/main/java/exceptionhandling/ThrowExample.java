package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age = 14;
		if (age >=18)
			System.out.println("Eligible for voting");
		else 
			throw new NumberFormatException("Not eligible to vote");
			//System.out.println("Not eligible for voting");

	}

}
