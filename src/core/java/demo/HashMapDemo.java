package core.java.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// two values it stores key values and data

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Good");
		hm.put(1, "Boy");
		hm.put(2, "Bad");
		hm.put(3, "Guy");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));

		Set sn = hm.entrySet();

		Iterator it = sn.iterator();{
			while(it.hasNext()) {
				//System.out.println(it.next());
				Map.Entry mp = (Map.Entry) it.next();
				System.out.println(mp.getKey());
				System.out.println(mp.getValue());
			}
		}

	}
}