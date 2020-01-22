package Interfaces;

interface Test {
	String getName();

	int getAge();
}

class Student implements Test {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "hello world";
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class MyApplication {
	public static void main(String[] args) {
		Test test = new Student();
		System.out.println(test.getName());
		System.out.println(test.getAge());
	}

}
