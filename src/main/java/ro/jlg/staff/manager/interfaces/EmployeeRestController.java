package ro.jlg.staff.manager.interfaces;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.jlg.staff.manager.application.EmployeeService;
import ro.jlg.staff.manager.application.dto.AddEmployeeDTO;
import ro.jlg.staff.manager.application.dto.ModifyEmployeeDTO;
import ro.jlg.staff.manager.domain.Employee;

import java.util.List;

@AllArgsConstructor
@RestController
public class EmployeeRestController {
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(this.employeeService.getEmployees());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(final @PathVariable String id){
        return ResponseEntity.ok(this.employeeService.getById(id));
    }

    @PostMapping("/employee")
    public ResponseEntity<Void> addEmployee(final @RequestBody AddEmployeeDTO dto){
        this.employeeService.addEmployee(dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> deleteEmployee(final @PathVariable String id){
        this.employeeService.deleteEmployee(id);
        return  ResponseEntity.ok().build();
    }

    @PatchMapping("/employee")
    public ResponseEntity<Void> modifyEmployee(final @RequestBody ModifyEmployeeDTO dto) {
        this.employeeService.modifyEmployee(dto);
        return ResponseEntity.ok().build();
    }
}
