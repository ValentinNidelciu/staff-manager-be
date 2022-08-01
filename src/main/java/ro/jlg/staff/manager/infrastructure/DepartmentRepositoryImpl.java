package ro.jlg.staff.manager.infrastructure;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;
import ro.jlg.staff.manager.domain.Department;
import ro.jlg.staff.manager.domain.DepartmentRepository;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    private MongoTemplate mongoTemplate;

    // constructor
    public DepartmentRepositoryImpl(final MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    // methods
    @Override
    public Department getDepartmentById(final String id) {
        return this.mongoTemplate.findById(id, Department.class);
    }

    @Override
    public List<Department> getAllDepartments() {
        return this.mongoTemplate.findAll(Department.class);
    }

    @Override
    public Department saveDepartment(Department department) {
        return this.mongoTemplate.save(department);
    }

    @Override
    public void deleteDepartment(String id) {
        final Query query = new Query(Criteria.where("_id").is(id));
        this.mongoTemplate.remove(query, Department.class);
    }
}
