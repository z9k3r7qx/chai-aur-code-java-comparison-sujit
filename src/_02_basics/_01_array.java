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
	}

}