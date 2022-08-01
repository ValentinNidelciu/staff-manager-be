package ro.jlg.staff.manager.infrastructure;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ro.jlg.staff.manager.domain.Employee;
import ro.jlg.staff.manager.domain.EmployeeRepository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private MongoTemplate mt;

    public EmployeeRepositoryImpl(MongoTemplate mt) {
        this.mt = mt;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.mt.findAll(Employee.class);
    }

    @Override
    public Employee getEmployeeById(String id) {
        return this.mt.findById(id, Employee.class);
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.mt.save(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        final Query query = new Query(Criteria.where("_id").is(id));
        this.mt.remove(query,Employee.class);
    }
}
