package _19.dynamic.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DynamicNavigationBean {
	private String name;
	private String password;

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

	private int counter = 0;
	private boolean locked = false;

	public String login() {
		// Do some processing
		if (name.equals("Levent") && password.equals("java")) {
			counter = 0;
			locked = false;
			return "success";
		}
		counter++;
		if (locked) {
			return "locked";
		}
		return "failure";
	}

	public String checkCounter() {

		if (counter > 3) {
			locked = true;
			return "locked";
		} else
			return "retry";
	}
}