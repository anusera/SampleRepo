package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		
		//add()
		a.add("green");
		a.add("blue");
		a.add("red");
		a.add("green");
		System.out.println(a);
		
		//get()
		String s = a.get(2);
		System.out.println(s);
		System.out.println(a.get(3));
		
		//set()
		a.set(1, "white");
		System.out.println(a);
				
		//indexOf()
		System.out.println(a.indexOf("green"));
		System.out.println(a.indexOf("red"));
		
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
