package ro.jlg.staff.manager.infrastructure;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ro.jlg.staff.manager.domain.Manager;
import ro.jlg.staff.manager.domain.ManagerRepository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ManagerRepositoryImpl implements ManagerRepository{
    private MongoTemplate mongoTemplate;

    @Override
    public void addManager(final Manager manager) {
        this.mongoTemplate.save(manager);
    }

    @Override
    public List<Manager> getAllManagers() {
        return this.mongoTemplate.findAll(Manager.class);
    }

    @Override
    public Manager getManagerById(final String managerId) {
        return this.mongoTemplate.findById(managerId, Manager.class);
    }

    @Override
    public void deleteManager(final String managerId) {
        final Query query = new Query(Criteria.where("_id").is(managerId));
        this.mongoTemplate.remove(query, Manager.class);
    }

    @Override
    public boolean managerEmailExists(final String email) {
        final Query query = new Query(Criteria.where("email").is(email));
        final Manager manager = this.mongoTemplate.findOne(query, Manager.class);

        return manager != null ;
    }
}
