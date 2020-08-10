package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {

	public void insertEmployee(Employee employee);

	public List<Employee> findAllEmployees();

	public void removeEmployee(int id);

}
