package _26.radiobutton;

public class RadioButtonModel {

	private String radioLabel;
	private String radioValue;
	
	public RadioButtonModel(String radioLabel, String radioValue) {
		super();
		this.radioLabel = radioLabel;
		this.radioValue = radioValue;
	}
	public String getRadioLabel() {
		return radioLabel;
	}
	public void setRadioLabel(String radioLabel) {
		this.radioLabel = radioLabel;
	}
	public String getRadioValue() {
		return radioValue;
	}
	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	

}
