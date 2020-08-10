package ajax;

import java.util.LinkedHashMap;
import java.util.Map;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjaxBean2 {

	private String key;
	private String value;
	
	private String selected;
	private Map<String, String> faremeworkMap;
	
	public AjaxBean2() {
		faremeworkMap = new LinkedHashMap<>();
		faremeworkMap.put("JSF", "Java Server Faces");
		faremeworkMap.put("Spring", "Spring");		
	}
	
	public void addFramework(String key, String value) {
		
		faremeworkMap.put(key, value);
	}
}
