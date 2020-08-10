package _14.none.scoped;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionScopedInjectBean {

	// @ManagedProperty annotation'i ile DI islemini JSF'e birakiyoruz.
	@ManagedProperty(value = "#{noneScopedMessageBean}")
	private NoneScopedMessageBean noneScopedMessageBean;

	public NoneScopedMessageBean getNoneScopedMessageBean() {
		return noneScopedMessageBean;
	}

	// Setter Injection'in gerceklesmesi icin setter metodu tanimlanmalidir.
	public void setNoneScopedMessageBean(NoneScopedMessageBean noneScopedMessageBean) {
		this.noneScopedMessageBean = noneScopedMessageBean;
	}

	@ManagedProperty("admin")
	// @ManagedProperty annotaion ile String tipi icin de DI islemi yapabiliriz.
	// name property'si icin initialize islemini gerceklestirebiliriz.
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}