package ro.jlg.staff.manager.infrastructure;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import ro.jlg.staff.manager.domain.Department;
import ro.jlg.staff.manager.domain.DepartmentRepository;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Repository
@AllArgsConstructor
public class DepartmentRepositoryImpl implements DepartmentRepository {

    private MongoTemplate mongoTemplate;

    @Override
    public Department getDepartmentById(final String id) {
        return this.mongoTemplate.findById(id, Department.class);
    }

    @Override
    public List<Department> getAllDepartments() {
        return this.mongoTemplate.findAll(Department.class);
    }

    @Override
    public Department saveDepartment(final Department department) {
        return this.mongoTemplate.save(department);
    }

    @Override
    public void deleteDepartment(final String id) {
        final Query query = new Query(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query, Department.class);
    }
}
