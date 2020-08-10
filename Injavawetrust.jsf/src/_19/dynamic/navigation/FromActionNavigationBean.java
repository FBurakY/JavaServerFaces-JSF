package _19.dynamic.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FromActionNavigationBean {

	public String navigate1() {
		return "navigate";
	}

	public String navigate2() {
		return "navigate";
	}
}
