package _18.static1.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NavigationBean {

	public String goToPage3() {
		return "page3";
	}
}
