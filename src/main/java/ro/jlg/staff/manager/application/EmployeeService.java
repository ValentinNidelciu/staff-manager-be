package ro.jlg.staff.manager.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.jlg.staff.manager.application.dto.AddEmployeeDTO;
import ro.jlg.staff.manager.application.dto.ModifyEmployeeDTO;
import ro.jlg.staff.manager.domain.Employee;
import ro.jlg.staff.manager.domain.EmployeeRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;


    public List<Employee> getEmployees(){
        return this.employeeRepository.getAllEmployees();
    }

    public Employee getById(final String id){
        return this.employeeRepository.getEmployeeById(id);
    }

    public void deleteEmployee(final String id){
        this.employeeRepository.deleteEmployee(id);
    }

    public void addEmployee(final AddEmployeeDTO dto){

        final String email = dto.getEmail();

        if( employeeRepository.emailExists(email)){
            throw new RuntimeException("Email already exists");
        }
        else{
            final Employee employee = new Employee(
                    UUID.randomUUID().toString(),
                    dto.getName(),
                    dto.getEmail(),
                    LocalDateTime.parse(dto.getDateOfBirth())
            );

            this.employeeRepository.saveEmployee(employee);
        }
    }

    public void modifyEmployee(final ModifyEmployeeDTO dto){
        final Employee employee = this.employeeRepository.getEmployeeById(dto.getId());

        employee.modify(dto.getEmail(), dto.getDateOfBirth());

        this.employeeRepository.saveEmployee(employee);

    }




}
