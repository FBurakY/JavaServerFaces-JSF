package _08.backing.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIInput;

@ManagedBean(name="backingBean")
@RequestScoped
public class HelloBackingBean {

    private UIInput name;
    private UIInput password;

    public UIInput getName() {
	return name;
    }

    public void setName(UIInput name) {
	this.name = name;
    }

    public UIInput getPassword() {
	return password;
    }

    public void setPassword(UIInput password) {
	this.password = password;
    }
}
