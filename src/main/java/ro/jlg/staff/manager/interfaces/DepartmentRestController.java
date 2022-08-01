package ro.jlg.staff.manager.interfaces;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.jlg.staff.manager.application.DepartmentService;
import ro.jlg.staff.manager.application.dto.AddDepartmentDTO;
import ro.jlg.staff.manager.application.dto.ModifyDepartmentDTO;
import ro.jlg.staff.manager.domain.Department;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
public class DepartmentRestController {
    private DepartmentService departmentService;

    @GetMapping("department")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok(this.departmentService.getAllDepartments());
    }

    @GetMapping("department/{id}")
    public ResponseEntity<Department> getDepartmentById(final String id) {
        return ResponseEntity.ok(this.departmentService.getDepartmentById(id));
    }

    @PostMapping("department")
    public ResponseEntity<Void> addDepartment(final @RequestBody AddDepartmentDTO addDepartmentDTO) {
        this.departmentService.addDepartment(addDepartmentDTO);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("department/{id}")
    public ResponseEntity<Void> modifyDepartment(final @RequestBody ModifyDepartmentDTO modifyDepartmentDTO) {
        this.departmentService.modifyDepartment(modifyDepartmentDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("department/{id}")
    public ResponseEntity<Void> deleteDepartment(final @PathVariable String id) {
        this.departmentService.deleteDepartment(id);
        return ResponseEntity.ok().build();
    }

}
