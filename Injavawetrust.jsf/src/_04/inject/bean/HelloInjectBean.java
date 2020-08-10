package _04.inject.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloInjectBean {

	// @ManagedProperty annotation'i ile DI islemini JSF'e birakiyoruz.
	@ManagedProperty(value = "#{message}")
	private MessageBean messageBean;

	// Setter Injection'in gerceklesmesi icin setter metodu tanimlanmalidir.
	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
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

	public String getSayWelcome() {
		if ("".equals(name) || name == null) {
			return "";
		} else {
			// MessageBean sinifinda yer alan metodu kullaniyoruz.
			// messageBean reference degiskenimiz JSF tarafindan olusturulan
			// MessageBean objesini gostermektedir.

			return messageBean.getSayWelcome() + name;
		}
	}

}