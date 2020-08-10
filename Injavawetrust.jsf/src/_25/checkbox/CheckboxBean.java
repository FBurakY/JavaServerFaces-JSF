package _25.checkbox;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxBean {

	private boolean contactMe;
	// default secili olarak yapmak icin ;
	// private boolean contactMe=true;

	public boolean isContactMe() {
		return contactMe;
	}

	public void setContactMe(boolean contactMe) {
		this.contactMe = contactMe;
	}

	// f:selectItem hardcoded
	private String[] progLanguages;

	public String[] getProgLanguages() {
		return progLanguages;
	}

	public void setProgLanguages(String[] progLanguages) {
		this.progLanguages = progLanguages;
	}

	// f:selectItems with array
	private String[] jpaFrameworks = {"Hibernate"};

	// default secili olarak yapmak icin ;
	// private String[] jpaFrameworks= {"Hibernate"};

	public String[] getJpaFrameworks() {
		return jpaFrameworks;
	}

	public void setJpaFrameworks(String[] jpaFrameworks) {
		this.jpaFrameworks = jpaFrameworks;
	}

	public String[] getPreparedJpaFrameworks() {
		return new String[]{"EclipseLink", "Hibernate", "OpenJPA", "DataNucleus"};
	}

	// f:selectItems with map
	private String[] mvcFrameworks;

	public String[] getMvcFrameworks() {
		return mvcFrameworks;
	}
	public void setMvcFrameworks(String[] mvcFrameworks) {
		this.mvcFrameworks = mvcFrameworks;
	}

	public Map<String, String> getPreparedMVCFrameworks() {
		Map<String, String> mvcFrameworksMap = new LinkedHashMap<String, String>();
		mvcFrameworksMap.put("JSF Framework", "JSF");
		mvcFrameworksMap.put("Spring Framework", "Spring");
		mvcFrameworksMap.put("Vaadin Framework", "Vaadin");
		return mvcFrameworksMap;
	}

	// f:selectItem Object dizisi kullanabiliriz. Oncelikle label ve value
	// karsilik gelecek bir model olusturalim.
	private String[] databases;

	public String[] getDatabases() {
		return databases;
	}

	public void setDatabases(String[] databases) {
		this.databases = databases;
	}

	public CheckboxModel[] getPreparedDatabases() {
		CheckboxModel[] databasesCheckBoxModel = new CheckboxModel[3];
		databasesCheckBoxModel[0] = new CheckboxModel("Oracle", "Oracle RDBMS");
		databasesCheckBoxModel[1] = new CheckboxModel("MSSQL", "MSSQL RDBMS");
		databasesCheckBoxModel[2] = new CheckboxModel("MySQL", "MySQL RDBMS");
		return databasesCheckBoxModel;
	}

}
