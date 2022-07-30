package com.spring.Dao;

import com.spring.model.Gas;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.eclipse.persistence.jpa.JpaHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository("gasBookingDao")
//@org.springframework.transaction.annotation.Transactional
@Transactional
@Repository
public class GasBookingDaoImpl implements GasBookingDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Integer insert(Gas gas) {
        Session session = sessionFactory.getCurrentSession();
        Integer save = (Integer) session.save(gas);
        System.out.println("integer in gasbookingDaoImpl is : " + save);
        System.out.println("session.save(gas).getClass().getName() : " + session.save(gas).getClass().getName());
        return save;
    }

    @Override
    public Gas showBooking(Integer Id) {
        Session session = sessionFactory.getCurrentSession();
        Gas get = session.get(Gas.class, Id);
        get.getBookingId();
        return get;
    }

    @Override
    public void DeleteBooking(Integer Id) {
        Session session = sessionFactory.getCurrentSession();
        Gas get = session.get(Gas.class, Id);
        System.out.println("value of gas object of get is : " + get);
        session.delete(get);
    }

    @Override
    public List<Gas> ShowAllBooking(Integer Id) {
        Session session = sessionFactory.openSession();
        String sql = "from Gas";
        Query query = session.createQuery(sql);
        List<Gas> gas = query.list();
        System.out.println("Get All data Fom gas Entity : " + gas);
        return gas;
    }

    @Override
    public void UpdateBooking(Gas gas) {
        Session session = sessionFactory.getCurrentSession();
        session.update(gas);
    }

}
