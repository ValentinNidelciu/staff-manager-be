package ro.jlg.staff.manager.domain;

import java.util.List;

public interface DepartmentRepository {

    Department getDepartmentById(final String id);
    List<Department> getAllDepartments();
    Department saveDepartment(final Department department);
    void deleteDepartment(final String id);

}
