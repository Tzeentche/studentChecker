package edu.javacourse.city.domain.manager;

import edu.javacourse.city.domain.register.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.imageio.spi.ServiceRegistry;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;

public class PersonManager {

    public static void main(String[] args) {

        sessionExample();

        jpaExample();
    }

    private static void jpaExample() {
        EntityManagerFactory em = Persistence.createEntityManagerFactory("persistence");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Person p = new Person();
        p.setFirstName("Алексей");
        p.setLastName("Федоров");
        em.persist(p);
        System.out.println(p.getPersonId());

        em.getTransaction().commit();

        em = emf.createEntityManager();
        List list = em.createQuery("FROM person").getResultList();
        list.forEach(p1 -> System.out.println(p1));

        em.close();
    }

    private static void sessionExample() {
        SessionFactory sf = buildSessionFactory();

        Session session = sf.openSession();
        session.getTransaction().begin();

        Person p = new Person();
        p.setFirstName("Василий");
        p.setLastName("Сидоров");

        Long id = (Long)session.save(p);

        session.getTransaction().commit();
        session.close();

        session = sf.openSession();
        Person person = session.get(Person.class, id);
        System.out.println(person);
        session.close();

        session = sf.openSession();

        List<Person> list = session.createQuery("FRON Person", Person.class).list();
        list.forEach(p1 -> System.out.println(p1));

        session.close();
    }

    private static SessionFactory buildSessionFactory() {

        try {

            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate_cfg.xml").build();

            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

            return metadata.getSessionFactoryBuilder().build();

        } catch(Exception ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
