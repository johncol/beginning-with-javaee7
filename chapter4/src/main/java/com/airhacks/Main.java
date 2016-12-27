package com.airhacks;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.airhacks.domain.Book;

public class Main {
    
    public static void main(String[] args) {
	Book book = new Book("Enders game", 4.5F, "A book about enders mission to save earth", "8-23849432", 456, false);
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;
	try {
	    emf = Persistence.createEntityManagerFactory("chapter4PU");
	    em = emf.createEntityManager();
	    tx = em.getTransaction();
	    tx.begin();
	    em.persist(book);
	    tx.commit();
	} catch (Exception e) {
	    if (tx != null) { tx.rollback(); }
	} finally {
	    if (em != null) { em.close(); }
	    if (emf != null) { emf.close(); }
	}
    }

}
