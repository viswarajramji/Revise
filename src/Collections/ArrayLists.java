package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	public int id;
	public String name;
	public int age;

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof Student) {
			Student student = (Student) obj;
			if (student.id == this.id) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}

public class ArrayLists {
	public static void main(String[] args) {
		Student s1 = new Student(1, "viswa", 1);
		Student s2 = new Student(2, "shan", 2);
		Student s3 = new Student(0, "Suru", 3);
		List<Student> arraylist = new ArrayList<>();
		arraylist.add(s1);
		arraylist.add(s2);
		arraylist.add(s3);
		Collections.sort(arraylist, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.id - o2.id;
			}
		});

		for (Student student : arraylist) {
			System.out.println(student.getId());
		}
	}
}
