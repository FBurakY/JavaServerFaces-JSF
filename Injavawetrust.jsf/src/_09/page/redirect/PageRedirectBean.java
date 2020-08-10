package _09.page.redirect;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PageRedirectBean {
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
}
