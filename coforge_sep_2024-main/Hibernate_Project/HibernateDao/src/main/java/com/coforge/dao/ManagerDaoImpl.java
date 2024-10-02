package com.coforge.dao;

import com.coforge.exception.ManagerException;
import com.coforge.model.Manager;
import com.coforge.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManagerDaoImpl implements ManagerDao {

    Transaction transaction;
    SessionFactory sessionFactory;
    Session session;

    public ManagerDaoImpl() {
       // Configuration configuration = new Configuration().configure();
        //sessionFactory = configuration.buildSessionFactory();
        sessionFactory= HibernateSessionFactory.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.getTransaction();
    }

    @Override
    public List<Manager> getAllManagers() throws ManagerException {
        if (session.createQuery("from Manager").list().isEmpty())
            throw new ManagerException("manager list is empty");
        else
            return session.createQuery("from Manager").list();
    }

    @Override
    public Manager addManager(Manager manager) throws ManagerException {
        if (session.get(Manager.class, manager.getManagerId()) == null) {
            transaction.begin();
            session.save(manager);
            transaction.commit();
            return manager;
        }
        throw new ManagerException("manager id is already present");
    }

    @Override
    public Manager searchManager(long id) throws ManagerException {
        if (session.get(Manager.class, id) == null)
            throw new ManagerException("manager id not found");
        else
            return  session.get(Manager.class, id);
    }

    @Override
    public Manager deleteManager(long id) throws ManagerException {
        Manager manager = session.get(Manager.class, id);
        if (manager != null) {
            transaction.begin();
            session.delete(searchManager(id));
            transaction.commit();
            return manager;
        }
        throw new ManagerException("manager id not present");
    }

    @Override
    public Manager updateManager(Manager manager) throws ManagerException {
        if (searchManager(manager.getManagerId()) != null) {
            transaction.begin();
            session.merge(manager);
            transaction.commit();
            return manager;
        }
          throw new ManagerException("manager id not found");
    }
}
