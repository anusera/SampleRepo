package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List a = new ArrayList();
		
		//Add
		a.add("green");
		a.add(1);
		a.add('c');
		a.add(false);
		a.add("green");
		a.add(4);
		System.out.println(a);
		
		//get()
		Object s = a.get(4);
		System.out.println(s);
		System.out.println(a.get(3));
		
		//set()
		a.set(1, "white");
		System.out.println(a);
		
		//indexOf()
		System.out.println(a.indexOf("green"));
		System.out.println(a.indexOf(false));
		
		//lastIndexOf()
		System.out.println(a.lastIndexOf("green"));
		
		//remove()
		a.remove(2);
		System.out.println(a);
		a.remove("green");
		System.out.println(a);
		
		//contains()
		System.out.println(a.contains("red"));
				
		//isEmpty()
		System.out.println(a.isEmpty());
				
		//size()
		System.out.println(a.size());
		
		

	}

}
