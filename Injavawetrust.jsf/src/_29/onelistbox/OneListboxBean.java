package _29.onelistbox;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OneListboxBean {

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

	public List<String> getPreparedYears() {
		return Arrays.asList(new String[]{"2015", "2016", "2017", "2018"});
	}

}
