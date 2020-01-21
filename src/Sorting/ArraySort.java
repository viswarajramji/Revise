package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	int id;
	String name;
	int age;

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

class SortById implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name) < 0 ? -1 : 1;
	}
}

class ArraySort {
	public static void main(String[] args) {
		Student str[] = { new Student(3, "viswa", 26),
				new Student(2, "suru", 26), new Student(1, "shan", 29) };

		Arrays.sort(str, new SortById());

		for (Student stu : str) {
			System.out.println(stu.id + " " + stu.name + " " + stu.age);
		}
		
		Arrays.sort(str, new SortByName());

		for (Student stu : str) {
			System.out.println(stu.id + " " + stu.name + " " + stu.age);
		}
	}
}
