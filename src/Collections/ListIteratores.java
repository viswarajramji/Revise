package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratores {
	public static void main(String[] args) {
		Student s1 = new Student(1, "viswa", 1);
		Student s2 = new Student(2, "shan", 2);
		Student s3 = new Student(0, "Suru", 3);
		List<Student> arraylist = new ArrayList<>();
		arraylist.add(s1);
		arraylist.add(s2);
		arraylist.add(s3);
		Iterator<Student> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().id);
		}
		iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());

		}
	}
}
