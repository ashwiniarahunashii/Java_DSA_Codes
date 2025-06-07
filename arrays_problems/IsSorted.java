package Java_DSA_Codes.arrays_problems;
import java.util.*;
public class IsSorted {
// This program checks if an array is sorted in non-decreasing order
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr = {2,1,1,4,2,4};
		boolean res=IsArraySorted(arr);
		System.out.println("Is array sorted? "+res);
		
	}
public static boolean IsArraySorted(int[] arr) {
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>=arr[i-1]) {
			return true;
		}else {
			return false;
		}
	}
	return true;
 }
}