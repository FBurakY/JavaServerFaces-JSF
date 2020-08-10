package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String INSERT_EMPLOYEE = "insert into employee(name,surname,salary) values(?,?,?)";
	private static final String ALL_EMPLOYEE = "select * from employee";
	private static final String DELETE_EMPLOYEE = "delete from employee where id=?";

	@Override
	public void insertEmployee(Employee employee) {
		ConnectionManager manager = ConnectionManager.getInstance();
		DataSource dataSource = manager.getMySQLDataSource();
		//
		String name = employee.getName();
		String surname = employee.getSurname();
		int salary = employee.getSalary();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_EMPLOYEE);
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setInt(3, salary);
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> findAllEmployees() {

		List<Employee> employeeList = new ArrayList<Employee>();
		ConnectionManager manager = ConnectionManager.getInstance();
		DataSource dataSource = manager.getMySQLDataSource();

		Connection connection;
		PreparedStatement ps;
		try {
			connection = dataSource.getConnection();
			ps = connection.prepareStatement(ALL_EMPLOYEE);

			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				// kayitlari cek
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String surname = resultSet.getString("surname");
				int salary = resultSet.getInt("salary");

				Employee employee = new Employee(id, name, surname, salary);// employee
																			// objesi
																			// olustur
				employeeList.add(employee); // listeye ekle
			}

			resultSet.close();
			ps.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employeeList;

	}

	@Override
	public void removeEmployee(int id) {
		ConnectionManager manager = ConnectionManager.getInstance();
		DataSource dataSource = manager.getMySQLDataSource();
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_EMPLOYEE);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
