package _07.inject.bean.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "helloInjectBeanCDI")
@SessionScoped
public class HelloInjectBeanCDI implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private MessageBeanCDI messageBean;

    public void setMessageBean(MessageBeanCDI messageBean) {
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