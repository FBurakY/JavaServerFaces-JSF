package _14.none.scoped;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@ManagedBean
@NoneScoped
public class NoneScopedBean {
	private String name;
	private String password;
	private int counter;

	public NoneScopedBean(){
		System.out.println("Constructed!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCounter() {
		return ++counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getHashCode() {
		return super.hashCode();
	}
	
	public String getGreeting() {
		if (name != null && name.length() > 0) {
			return "Welcome to www.injavawetrust.com , " + name + "!";
		} else {
			return "";
		}
	}
}
