package _10.request.scoped;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RequestScopedBean {

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

	// Her bir request sonucunda yeni bir bean objesi (instance) olusur.
	// Bunu gorebilmek icin basit olarak hashCode degerini yazdirabiliriz.
	// Metodu cagirabilmek icin get/setter isim kuralina uygun sekilde
	// tanimliyoruz.
	// Boylelikle #{requestScopedBean.hashCode} seklinde cagirabiliriz.
	public int getHashCode() {		
		return super.hashCode();
	}
}
