package _06.inject.bean.xml;

public class HelloInjectBeanXML {

	private MessageBeanXML messageBean;

	public void setMessageBean(MessageBeanXML messageBean) {
		this.messageBean = messageBean;
	}

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
			// MessageBeanXML sinifinda yer alan metodu kullaniyoruz.
			// messageBean reference degiskenimiz JSF tarafindan olusturulan
			// MessageBeanXML objesini gostermektedir.

			return messageBean.getSayWelcome() + name;
		}
	}

}