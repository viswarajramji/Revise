package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		Student s1 = new Student(1, "viswa", 1);
		Student s2 = new Student(2, "shan", 2);
		Student s3 = new Student(0, "Suru", 3);
		Student s4 = new Student(0, "Suru", 3);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set.size());
		;

	}
}
