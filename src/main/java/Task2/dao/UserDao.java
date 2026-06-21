package Task2.dao;

import Task2.models.User;
import Task2.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDao {

    public User findById(Integer id) {
        return HibernateUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.merge(user);
        tx1.commit();
        session.close();
    }

    public void delete(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        User user = session.get(User.class, id);
        session.remove(user);
        tx1.commit();
        session.close();
    }

    public List<User> findAll() {
        return HibernateUtil.getSessionFactory().openSession().createQuery("From User").list();

    }
}