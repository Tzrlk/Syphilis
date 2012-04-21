package nz.co.aetheric.syphilis.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository @Transactional
public class UserDao implements MongoRepository<UserBean, Long> {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public UserBean save(UserBean entity) {
        mongoTemplate.save(entity);
        return mongoTemplate.findById(entity.id, UserBean.class);
    }

    @Override
    public List<UserBean> save(Iterable<? extends UserBean> entites) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserBean findOne(Long aLong) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean exists(Long aLong) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<UserBean> findAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long count() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Long aLong) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(UserBean entity) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Iterable<? extends UserBean> entities) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteAll() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<UserBean> findAll(Sort sort) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Page<UserBean> findAll(Pageable pageable) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
