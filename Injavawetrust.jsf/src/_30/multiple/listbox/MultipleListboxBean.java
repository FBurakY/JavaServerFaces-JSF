package _30.multiple.listbox;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MultipleListboxBean {

	private String[] languages;

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	private String[] years;

	public String[] getYears() {
		return years;
	}

	public void setYears(String[] years) {
		this.years = years;
	}

	public List<String> getPreparedYears() {
		return Arrays.asList(new String[]{"2015", "2016", "2017", "2018"});
	}

}
