package _22.output;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OutputBean {
	
	public String plainText = "This is plain text!";
	public String htmlText = "<input type='text' size='20' />";

	public String getPlainText() {
		return plainText;
	}
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
	public String getHtmlText() {
		return htmlText;
	}
	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}
}
