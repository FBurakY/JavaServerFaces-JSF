package _04.inject.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message")
@RequestScoped
public class MessageBean {

	private String sayWelcome = "Welcome to www.injavawetrust.com , ";

	public String getSayWelcome() {
		return sayWelcome;
	}

	public void setSayWelcome(String sayWelcome) {
		this.sayWelcome = sayWelcome;
	}

}