package _23.button;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ButtonBean {

	public String navigateToPage1() {
		return "page1";
	}

	public String navigateToPage2() {
		return "page2";
	}

}
