package _34.dataTable;

import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PersonDataBean {

	private String name;
	private String surname;
	private char gender;
	private int age;
	private List<Person> persons;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	//@PostConstruct
	public void initialize() {
		persons = new ArrayList<Person>();
		persons.add(new Person("name1", "surname1", 'M', 20));
		persons.add(new Person("name2", "surname2", 'F', 25));
		persons.add(new Person("name3", "surname3", 'F', 15));
		persons.add(new Person("name4", "surname4", 'M', 30));
		persons.add(new Person("name5", "surname5", 'M', 35));
	}

	public void addPerson() {
		Person person = new Person(name, surname, gender, age);
		persons.add(person);
		
	}
	
	public void deletePerson(Person person) {
		persons.remove(person);
		
	}
}
