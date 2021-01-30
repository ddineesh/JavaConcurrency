package com.dinesh;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateInteger {
	
	// first solution

	public static void main(String[] args) {
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + my_array[j]);
				}
			}
		}

		// second solution with Hashtable

		Set<Integer> nosList = new HashSet<Integer>();
		for (int nos : my_array) {

			if (!nosList.add(nos)) {
				System.out.println("Duplicate nos:" + nos);
			}

		}

		// Third Solution

		Hashtable<Integer, Integer> noHashTable = new Hashtable<Integer, Integer>();
		for (int nos : my_array) {
			Integer count = noHashTable.get(nos);
			if (count == null) {
				noHashTable.put(nos, 1);
			} else {
				noHashTable.put(nos, ++count);
			}
		}

		System.out.println(noHashTable);
		Set<Entry<Integer, Integer>> entrySet = noHashTable.entrySet();
		for (Entry<Integer, Integer> eSet : entrySet) {
			if (eSet.getValue() > 1) {
				System.out.println(" The Duplicate Value: " + eSet.getKey());
			}
		}
	}

}
