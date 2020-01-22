package Interfaces;

abstract class duder {
	abstract public String getName();

	abstract public int getAge();

}

public class AbstractClass extends duder {

	@Override
	public String getName() {
		return "hello world";
	}

	@Override
	public int getAge() {
		return 0;
	}

	public static void main(String[] args) {
		AbstractClass abc=new AbstractClass();
		System.out.println(abc.getName());
		System.out.println(abc.getAge());
	}
}
