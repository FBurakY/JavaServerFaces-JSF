package _33.facelets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FaceletsTemplateBean {

	private String defaultFooterParam = "This is defaultFooterParam parameter.";
	private String defaultHeaderMessage = "This is defaultHeaderMessage parameter.";

	public String getDefaultFooterParam() {
		return defaultFooterParam;
	}

	public void setDefaultFooterParam(String defaultFooterParam) {
		this.defaultFooterParam = defaultFooterParam;
	}

	public String getDefaultHeaderMessage() {
		return defaultHeaderMessage;
	}

	public void setDefaultHeaderMessage(String defaultHeaderMessage) {
		this.defaultHeaderMessage = defaultHeaderMessage;
	}
}
