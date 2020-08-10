package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name ="personDataBean")
public class PersonDataBean {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
