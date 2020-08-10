package _24.link;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LinkBean {
	
	public String navigateToPage1() {
		return "page1";
	}

	public String navigateToPage2() {
		return "page2";
	}
	//outcome attribute'de property kullanilir.
	public String myPage1Outcome="page1";

	public String getMyPage1Outcome() {
		return myPage1Outcome;
	}

}
