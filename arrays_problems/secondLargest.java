package Java_DSA_Codes.arrays_problems;

import java.util.*;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20,1,-34,28,959,43,89};
		
//		Arrays.sort(array);
//		System.out.println(array[n-2]);
		
		int seclarge=secLargest(array);
		System.out.println(seclarge);
	}


static int secLargest(int[] array) {
	int largest=-1,secLargest=-1;
	int n=array.length;
	for(int i=0;i<n;i++) {
		if(array[i]>largest) {
			largest=array[i];
		}
	}

	for(int i=0;i<n;i++) {
		if(array[i]>secLargest && array[i]!=largest) {
			secLargest=array[i];
		}
	}
	return secLargest;
}
}

// <!--Program-1: Write a JavaScript to design a simple calculator to perform the following operations: sum, product, difference and quotient.-->
// <!-- while creating - only once -->
// <!-- git init -->
// <!-- git add A- -->
// <!-- git commit -m " name of tthe commit" -->
// <!-- git branch -M main -->
// <!-- git remote origin "url" -->
// <!-- git push -u origin main -->

// <!-- after creating -->
// <!-- git add -A -->
//  <!--git commit -m "name"  -->
// <!-- git push --> 