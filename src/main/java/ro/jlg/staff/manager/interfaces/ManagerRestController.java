package ro.jlg.staff.manager.interfaces;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.jlg.staff.manager.application.ManagerService;
import ro.jlg.staff.manager.application.dto.AddManagerDTO;
import ro.jlg.staff.manager.application.dto.UpdateManagerDTO;
import ro.jlg.staff.manager.domain.Manager;

import java.util.List;

@RestController
@AllArgsConstructor
public class ManagerRestController {
    private ManagerService managerService;


    @GetMapping("/manager")
    public ResponseEntity<List<Manager>> getAllManagers(){
        return ResponseEntity.ok(this.managerService.getAllManagers());
    }

    @GetMapping("/manager/{id}")
    public ResponseEntity<Manager> getManagerById(final @PathVariable String managerId){
        return ResponseEntity.ok(this.managerService.getManagerById(managerId));
    }

    @DeleteMapping("/manager/{id}")
    public ResponseEntity<Void> deleteManager(final @PathVariable String managerId){
        this.managerService.deleteManager(managerId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/manager")
    public ResponseEntity<Void> addManager(final @RequestBody AddManagerDTO addManagerDTO){
        this.managerService.addManager(addManagerDTO);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/manager/{id}")
    public ResponseEntity<Void> updateManager(final @RequestBody UpdateManagerDTO updateManagerDTO){
        this.managerService.updateManager(updateManagerDTO);
        return ResponseEntity.ok().build();
    }

}
