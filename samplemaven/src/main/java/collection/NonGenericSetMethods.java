package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set a = new HashSet();
		
		//add()
		a.add("orange");
		a.add('c');
		a.add(1);
		a.add(true);
		a.add(34.5);
		a.add("peach");
		System.out.println(a);
		
		Set b = new HashSet();
		b.add("Apple");
		b.add('d');
		b.add(2);
		b.add(false);
		System.out.println(b);
		
		//addAll()
		a.addAll(b);
		System.out.println(a);
		
		//contains()
		System.out.println(a.contains(false));
		
		//containsAll()
		System.out.println(a.containsAll(b));
		
		//isEmpty()
		System.out.println(a.isEmpty());
		
		//remove()
		a.remove(true);
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
