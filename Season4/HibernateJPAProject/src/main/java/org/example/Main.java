package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("Frodo");
        customer1.setEmail("frodobaggins@shiremail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        System.out.println("Puffings with Anacondings in the Nations");
        em.getTransaction().begin();
        em.persist(customer1);


        em.getTransaction().commit();

        //System.out.println("Result: " + em.createNativeQuery("select 1 + 1").getSingleResult());

        em.close();
        emf.close();

    }
}