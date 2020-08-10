package _15.conversation.scoped;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ConversationScoped
public class ConversationScopedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Employee employee;
	public ConversationScopedBean() {
		employee = new Employee();
	}

	@Inject
	private Conversation conversation;

	public Conversation getConversation() {
		return conversation;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void beginConversation() {
		//Conversation basladiginda transient state'tir
		if (conversation.isTransient()) {
			conversation.begin();
		}

	}

	public void endConversation() {

		if (!conversation.isTransient()) {
			conversation.end();
		}

	}

	public String start() {
		beginConversation();
		return "02.loginConversationScoped.xhtml?faces-redirect=true";
	}

	public String finish() {
		endConversation();
		return "06.afterEndConversation.xhtml?faces-redirect=true";
	}

}
