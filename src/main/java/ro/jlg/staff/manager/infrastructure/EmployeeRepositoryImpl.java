package ro.jlg.staff.manager.infrastructure;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ro.jlg.staff.manager.domain.Employee;
import ro.jlg.staff.manager.domain.EmployeeRepository;

import java.util.List;

@AllArgsConstructor
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private MongoTemplate mongoTemplate;


    @Override
    public List<Employee> getAllEmployees() {
        return this.mongoTemplate.findAll(Employee.class);
    }

    @Override
    public Employee getEmployeeById(final String id) {
        return this.mongoTemplate.findById(id, Employee.class);
    }

    @Override
    public void saveEmployee(final Employee employee) {
        this.mongoTemplate.save(employee);
    }

    @Override
    public void deleteEmployee(final String id) {
        final Query query = new Query(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query,Employee.class);
    }

    @Override
    public boolean emailExists(final String email) {
        final Query query = new Query(Criteria.where("email").is(email));
        return this.mongoTemplate.exists(query,Employee.class);
    }
}
