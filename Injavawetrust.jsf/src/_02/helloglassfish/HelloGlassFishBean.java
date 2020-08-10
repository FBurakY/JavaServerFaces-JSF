package _02.helloglassfish;

import java.io.Serializable;

import javax.inject.Named;
//import javax.faces.bean.ManagedBean;

// @ManagedBean yerine @Named annotation kullanabiliriz.

// javax.faces.bean.ManagedBean yerine javax.inject.Named kullanabiliriz.

//import javax.faces.bean.SessionScoped;
// @Named kullandigimizda 
// javax.faces.bean.SessionScoped; yerine javax.enterprise.context.SessionScoped; kullanmamiz gereklidir.

import javax.enterprise.context.SessionScoped;

@Named(value = "glassfishBean")
@SessionScoped
// @ManagedBean
// @Named annotation kullanildiginda Serializable arabirimi implements
// edilmelidir.
public class HelloGlassFishBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
