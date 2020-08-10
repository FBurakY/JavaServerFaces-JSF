package controller;

import java.util.List;

//import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

@ManagedBean
@SessionScoped
public class EmployeeBean {

	private Employee employee = new Employee();
	private List<Employee> employees = null;
	private EmployeeDAO employeeDAO = null;

	//@PostConstruct
	public void initialize() {
		employeeDAO = new EmployeeDAOImpl();
		employees = employeeDAO.findAllEmployees();
	}

	public void addEmployee() {
		String name = employee.getName();
		String surname = employee.getSurname();
		int salary = employee.getSalary();
		Employee employee = new Employee(name, surname, salary);
		//
		employeeDAO.insertEmployee(employee);
		//
		employees = employeeDAO.findAllEmployees();
	}

	public void deleteEmployee(int id) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		//
		employeeDAO.removeEmployee(id);
		//
		employees = employeeDAO.findAllEmployees();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
