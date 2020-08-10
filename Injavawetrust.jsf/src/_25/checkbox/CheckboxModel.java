package _25.checkbox;

public class CheckboxModel {

	private String checkboxLabel;
	private String checkboxValue;
	
	public CheckboxModel(String checkboxLabel, String checkboxValue) {
		super();
		this.checkboxLabel = checkboxLabel;
		this.checkboxValue = checkboxValue;
	}
	public String getCheckboxLabel() {
		return checkboxLabel;
	}
	public void setCheckboxLabel(String checkboxLabel) {
		this.checkboxLabel = checkboxLabel;
	}
	public String getCheckboxValue() {
		return checkboxValue;
	}
	public void setCheckboxValue(String checkboxValue) {
		this.checkboxValue = checkboxValue;
	}
}
