package uz.pdp.secondproject.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import static uz.pdp.secondproject.config.MyListener.entityManagerFactory;

public class BaseRepo {

    public static final EntityManager em = entityManagerFactory.createEntityManager();

    public void begin() {
        em.getTransaction().begin();
    }

    public void commit() {
        em.getTransaction().commit();
    }

}
