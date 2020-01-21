package Sorting;

import java.util.Arrays;

public class ArraysSearach {
	public static void main(String[] args) {
		int arr[]={1,9,3,4,5,-1};
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr, 9);
		System.out.println(index);
	}

}
