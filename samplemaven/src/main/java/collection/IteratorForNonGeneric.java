package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorForNonGeneric {

	public static void main(String[] args) {
        Set a = new HashSet();
		a.add("orange");
		a.add('c');
		a.add(1);
		a.add(true);
		a.add(34.5);
		a.add("peach");
		
		Iterator it = a.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(a);

	}

}
