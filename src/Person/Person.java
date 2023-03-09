package Person;

import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	private Function function;
	private int salary;
	
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
	public Function getFunction() {
		return function;
	}
	public void setFunction(Function function) {
		this.function = function;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Person()	{

	}
	public Person(String name, int age, Function function, int salary) {
		this.name = name;
		this.age = age;
		this.function = function;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", function=" + function + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Person person = (Person) obj;
		if (this.function.equals(person.function) && this.salary == person.salary) {
			return true;
		}
			
		return false;
	}
	
	
	
	

}
