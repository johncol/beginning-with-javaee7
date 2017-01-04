package com.airhacks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.airhacks.domain.Book;

public class ManuallyGetEntityManager {

    public static void main(String[] ars) {
	Book book = new Book("Enders Game", "A book about ender and his game");
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("nameOfThePersistenceUnit");
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	em.persist(book);
	tx.commit();
	em.close();
	emf.close();
    }

}
