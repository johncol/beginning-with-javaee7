package com.airhacks.domain;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.validation.ConstraintViolationException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookIT {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter4TestPU");

    private EntityManager em;
    private EntityTransaction tx;

    @Before
    public void initEntityManager() {
	em = emf.createEntityManager();
	tx = em.getTransaction();
    }

    @After
    public void closeResources() {
	if (em != null) {
	    em.close();
	}
    }

    @Test
    public void shouldFindBook() {
	Book book = em.find(Book.class, 2L);
	assertEquals("Beginning Java EE 7", book.getTitle());
    }

    @Test
    public void shouldCreateBook() {
	Book book = new Book("H2G2", 12.5F, "The H", "1-543534534", 2313, false);
	tx.begin();
	em.persist(book);
	tx.commit();
	assertNotNull("ID should not be null", book.getId());
	
	book = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();
	assertEquals("The H", book.getDescription());
    }
    
    @Test(expected = ConstraintViolationException.class)
    public void shouldNotPassValidation() {
	Book book = new Book("test!!", 12.5F, "The H", "1-543534534", 2313, false);
	tx.begin();
	em.persist(book);
	tx.commit();
    }

}
