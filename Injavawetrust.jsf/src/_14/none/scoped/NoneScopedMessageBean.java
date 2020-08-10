package _14.none.scoped;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@ManagedBean
@NoneScoped
public class NoneScopedMessageBean {

	private String message = "Welcome to www.injavawetrust.com , ";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}