package ro.jlg.staff.manager.application;

import org.springframework.stereotype.Service;
import ro.jlg.staff.manager.application.dto.AddDepartmentDTO;
import ro.jlg.staff.manager.application.dto.ModifyDepartmentDTO;
import ro.jlg.staff.manager.domain.Department;
import ro.jlg.staff.manager.domain.DepartmentRepository;

import java.util.List;
import java.util.UUID;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    // constructor
    public DepartmentService(final DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // methods
    public Department getDepartmentById(final String id) {
        return this.departmentRepository.getDepartmentById(id);
    }

    public List<Department> getAllDepartments() {
        return this.departmentRepository.getAllDepartments();
    }

    public Department addDepartment (final AddDepartmentDTO addDepartmentDTO) {
        final Department department = new Department(
                UUID.randomUUID().toString(),
                addDepartmentDTO.getName(),
                addDepartmentDTO.getDescription(),
                addDepartmentDTO.getMaxEmployees()
        );
        return this.departmentRepository.saveDepartment(department);
    }

    public void modifyDepartment(final ModifyDepartmentDTO modifyDepartmentDTO) {
        final Department department = this.departmentRepository
                .getDepartmentById(modifyDepartmentDTO.getId());
        department.modifyDepartment(
                modifyDepartmentDTO.getName(),
                modifyDepartmentDTO.getDescription(),
                modifyDepartmentDTO.getMaxEmployees()
        );
    }

    public void deleteDepartment(final String id) {
        this.departmentRepository.deleteDepartment(id);
    }


}
