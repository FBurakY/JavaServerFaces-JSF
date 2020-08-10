package language;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LanguageBean {
	
	// Session Bazl� lokalde ki dil deste�ini alan k�s�m
	// Dil deste�i �rne�im
	
	private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
	
	public Locale getLocale() {		
		return locale;
	}
	
	public String getLanguage() {		
		return locale.getLanguage();		
	}
	
	public void changeLanguage(String language) {		
		locale = new Locale(language);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(language));
	}
	
}
