package core.java.demo;

import java.util.ArrayList;

public class ArrayUniqueNumber {

	public static void main(String[] args) {

		int a[] = { 3, 4, 3, 4, 3, 3, 3, 4, 5, 5, 6, 5, 4, 7, 7 };

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {

				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						k++;
					}
				}
				//System.out.println(a[i]);
				//System.out.println(k);
				if(k==1)
					System.out.println(a[i]+ " is a unique number");
			}
			
		}

	}

}
