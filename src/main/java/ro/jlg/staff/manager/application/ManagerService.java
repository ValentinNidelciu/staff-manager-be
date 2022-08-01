package ro.jlg.staff.manager.application;

import org.springframework.stereotype.Service;
import ro.jlg.staff.manager.application.dto.AddManagerDTO;
import ro.jlg.staff.manager.domain.Manager;
import ro.jlg.staff.manager.domain.ManagerRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ManagerService {
    private ManagerRepository managerRepository;
    public ManagerService(final ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

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
                addManagerDTO.getDateOfBirth(),
                addManagerDTO.getDepartmentId(),
                addManagerDTO.getSubordinatedEmployeeIds()
        );
    }
}
