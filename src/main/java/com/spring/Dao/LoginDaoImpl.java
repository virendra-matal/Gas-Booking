package com.spring.Dao;

import com.spring.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public Customer CkeckLogin(String Username, String Password) {

        System.out.println("Chekc for Login in UserDao class...");
        System.out.println("username: " + Username + "Password is :" + Password);
        Session session = sessionFactory.openSession();
        String sql2 = "from Customer where Username=?1 and Password=?2";
        String sql = "from Customer where Username=:user and Password=:pass";
//        String sql = "from Customer where Password=:pass";
        String sql1 = "from Customer";
        Query<Customer> query = session.createQuery(sql,Customer.class);
        query.setParameter("user", Username);
        query.setParameter("pass", Password);
//        Query query = session.createQuery(sql1);
        
        Customer customers = query.uniqueResult();
//        List<Customer> customers = query.list();
//        customers.forEach(System.out::println);

        System.out.println("query data in customerdaoimpl" + customers);

        if (customers != null) {
            
//            return null;
            return customers;
        }
        session.close();
        return null;
    }

}
