package _13.view.scoped;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewScopedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private int counter;

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

	public String getGreeting() {		
		if (name != null && name.length() > 0) {
			return "Welcome to www.injavawetrust.com , " + name + "!";
		} else {
			return "";
		}
	}

	public int getHashCode() {
		return super.hashCode();
	}
}
