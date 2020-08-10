package _21.input.text;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;

@ManagedBean
public class InputBean {

	private String name;
	private String password;
	private UIInput backingBinding;
	
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
	public UIInput getBackingBinding() {
		return backingBinding;
	}
	public void setBackingBinding(UIInput backingBinding) {
		this.backingBinding = backingBinding;
	}
}
