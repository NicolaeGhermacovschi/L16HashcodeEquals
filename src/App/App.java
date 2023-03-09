package App;

import java.util.HashSet;
import java.util.Set;

import Person.*;

// Lucru cu Set, Equals, HashCode, toString
public class App {
	


    public static void main(String[] args) {
    	
    	Set<Person> persons = new HashSet<>();
    	persons.add(new Person("Nicolae", 22, Function.DEVELOPER, 10000));
    	persons.add(new Person("Nicolae", 61, Function.DEVELOPER, 10800));
    	persons.add(new Person("Nicolae", 22, Function.HR, 10000));
    	persons.add(new Person("Nicolae", 48, Function.DEVELOPER, 10900));
    	persons.add(new Person("Nicolae", 60, Function.CEO, 10000));
    	
    	for (Person person : persons) {
			if (person.hashCode() >= 60) {
				System.out.println(person.toString());
				
			}
		}
    	System.out.println("Equals person");
    	for (Person person : persons) {
    		for (Person person2 : persons) {
				if (person.equals(person2)) {
					System.out.println(person.toString());
				}
			}
		}
    	
       
    }

}
