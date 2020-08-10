package _27.dropdown;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DropdownBean {

	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private String year;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String[] getPreparedYears() {
		return new String[]{"2015", "2016", "2017", "2018"};
	}

}
