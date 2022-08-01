package ro.jlg.staff.manager.domain;

import java.util.List;

public interface ManagerRepository {

    void addManager(final Manager manager);

    List<Manager> getAllManagers();

    Manager getManagerById(final String managerId);

    void deleteManager(final String managerId);

    boolean managerEmailExists(final String email);
}
