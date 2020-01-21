package Sorting;

import java.util.Arrays;

public class ArraySearchObjects {
	public static void main(String[] args) {
		Student str[] = { new Student(3, "viswa", 26),
				new Student(2, "suru", 26), new Student(1, "shan", 29) };
		Arrays.sort(str,new SortById());
		int index=Arrays.binarySearch(str,new Student(1, "viswa", 26) , new SortById());
		System.out.println(index);
	}
}
