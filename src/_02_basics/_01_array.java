package _02_basics;

import java.util.ArrayList;
import java.util.List;

public class _01_array {

	public static void main(String[] args) {

		
		int arr[]= {1,2,3,4};
		int arr1[] = new int[2];
		
		ArrayList<Integer> a1 = new ArrayList<>(List.of(1,2,3,4));
		
		a1.add(100);
		a1.remove(a1.size()-1);
		a1.add(0,100);
		a1.remove(0);
		boolean b1 = a1.contains(2);
		
		// indexOf 
		int a2  = a1.indexOf(2);
		
		ArrayList<Integer> a4 = new ArrayList<>(a1.subList(0, 2));
		
		
		//changing the original arraylist
		ArrayList<Integer> original = new ArrayList<>(List.of(1,2,3,4));
		List<Integer> view  = original.subList(1,3);
		view.clear();
		
		// add
		ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4));
		ArrayList<Integer> list2 = new ArrayList<>(List.of(5,6));
		list1.addAll(list2);
	}

}