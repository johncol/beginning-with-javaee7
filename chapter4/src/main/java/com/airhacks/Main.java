package com.airhacks;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.airhacks.domain.Book;

public class Main {
    
    public static void main(String[] args) {
	saveNewBook();
	printAll();
    }

    private static void saveNewBook() {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	Book book = new Book(null, 4.5F, "A book about enders mission to save earth", "8-23849432", 456, false);
	EntityTransaction tx = null;
	try {
	    emf = Persistence.createEntityManagerFactory("chapter4PU");
	    em = emf.createEntityManager();
	    tx = em.getTransaction();
	    tx.begin();
	    em.persist(book);
	    tx.commit();
	} catch (Exception e) {
	    e.printStackTrace();
	    if (tx != null) { tx.rollback(); }
	} finally {
	    if (em != null) { em.close(); }
	    if (emf != null) { emf.close(); }
	}
	System.out.println("Book: " + book);
    }

    private static void printAll() {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	try {
	    emf = Persistence.createEntityManagerFactory("chapter4PU");
	    em = emf.createEntityManager();
	    List<Book> books = em.createNamedQuery("findAllBooks", Book.class).getResultList();
	    books.forEach(System.out::println);
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    if (em != null) { em.close(); }
	    if (emf != null) { emf.close(); }
	}
    }

}
