package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethod {

	public static void main(String[] args) {
    Set<String> a = new HashSet<String>();
		
		
		a.add("Orange");
		a.add("Apple");
		a.add("Banana");
		
		//iterator()
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(a);

	}

}
