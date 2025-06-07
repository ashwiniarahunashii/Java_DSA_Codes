package Java_DSA_Codes.arrays_problems;

import java.util.*;
public class ArrayListProblm {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(60);
		list.add(70);
		
		System.out.println(list);
		System.out.println(list.contains(20));
		System.out.println(list.get(5));
		list.remove(Integer.valueOf(30));
		System.out.println(list);
		
		list.add(2,30);
		System.out.println(list);
		

		list.add(4,50);
		System.out.println(list);
		
	}

}
