package ro.jlg.staff.manager.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ro.jlg.staff.manager.application.dto.AddManagerDTO;
import ro.jlg.staff.manager.application.dto.UpdateManagerDTO;
import ro.jlg.staff.manager.domain.Manager;
import ro.jlg.staff.manager.domain.ManagerRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ManagerService {
    private ManagerRepository managerRepository;

    public List<Manager> getAllManagers() {
        return this.managerRepository.getAllManagers();
    }

    public Manager getManagerById(final String managerId) {
        return this.managerRepository.getManagerById(managerId);
    }

    public void deleteManager(final String managerId) {
        this.managerRepository.deleteManager(managerId);
    }

    public void addManager(final AddManagerDTO addManagerDTO) {
        final Manager manager = new Manager(
                UUID.randomUUID().toString(),
                addManagerDTO.getName(),
                addManagerDTO.getEmail(),
                LocalDate.parse(addManagerDTO.getDateOfBirth()),
                addManagerDTO.getDepartmentId(),
                addManagerDTO.getSubordinatedEmployeeIds()
        );
    }

    public void updateManager(final String managerId, final UpdateManagerDTO updateManagerDTO){
        final Manager manager = this.managerRepository.getManagerById(managerId);
        manager.update(updateManagerDTO);
        this.managerRepository.addManager(manager);
    }
}
