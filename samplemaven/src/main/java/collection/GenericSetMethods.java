package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> a = new HashSet<String>();
		
		//add()
		a.add("Orange");
		a.add("Apple");
		a.add("Banana");
		System.out.println(a);
		
		Set<String> b = new HashSet<String>();
		b.add("Carrot");
		b.add("Beetroot");
		System.out.println(b);
		
		//AddAll()
		a.addAll(b);
		System.out.println(a);
		
		//contains()
		System.out.println(a.contains("Carrot"));
		
		//containsAll()
		System.out.println(a.containsAll(b));
		
		//isEmpty()
		System.out.println(a.isEmpty());
		
		//remove()
		a.remove("Apple");
		System.out.println(a);
		
		//removeAll()
		a.removeAll(b);
		System.out.println(a);
		
		//size()
		System.out.println(a.size());
		
		//clear()
		a.clear();
		System.out.println(a);
		
		


	}

}
