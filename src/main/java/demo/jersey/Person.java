package demo.jersey;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	private int age;
	private String firstName;
	private String lastName;
	List<String> l;
	Map<String, String> m;
	
	
	public Map<String, String> getM() {
		return m;
	}

	public void setM(Map<String, String> m) {
		this.m = m;
	}

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}

	public Person() {
		
	}
	
	public Person(int a, String f, String l) {
		age = a;
		firstName = f;
		lastName = l;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
