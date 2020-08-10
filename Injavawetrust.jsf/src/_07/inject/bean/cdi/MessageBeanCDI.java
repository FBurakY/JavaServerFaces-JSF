package _07.inject.bean.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "messageBeanCDI")
@SessionScoped
public class MessageBeanCDI implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sayWelcome = "Welcome to www.injavawetrust.com , ";

    public String getSayWelcome() {
	return sayWelcome;
    }

    public void setSayWelcome(String sayWelcome) {
	this.sayWelcome = sayWelcome;
    }

}