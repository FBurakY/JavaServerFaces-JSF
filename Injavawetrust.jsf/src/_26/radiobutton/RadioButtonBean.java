package _26.radiobutton;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RadioButtonBean {

	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String maritalStatus;

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String[] getPreparedMaritalStatus() {
		return new String[]{"Married", "Engaged", "Single", "Java Man :)"};
	}

	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Map<String, String> getPreparedJobs() {
		Map<String, String> jobsMap = new LinkedHashMap<String, String>();
		jobsMap.put("Engineer", "Software Engineer");
		jobsMap.put("Architect", "Decorator");
		return jobsMap;
	}

	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public RadioButtonModel[] getPreparedDepartments() {
		RadioButtonModel[] departmentRadioButtonModel = new RadioButtonModel[3];
		departmentRadioButtonModel[0] = new RadioButtonModel("IT", "Software Dept");
		departmentRadioButtonModel[1] = new RadioButtonModel("Director", "Manager");
		departmentRadioButtonModel[2] = new RadioButtonModel("Accountant", "Accountant");
		return departmentRadioButtonModel;
	}

}
