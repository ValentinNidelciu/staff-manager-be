package ro.jlg.staff.manager.domain;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(final String id);

    void saveEmployee(final Employee employee);

    void deleteEmployee(final String id);
}
