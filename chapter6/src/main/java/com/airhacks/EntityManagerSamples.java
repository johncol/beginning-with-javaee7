package com.airhacks;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceUnit;

import com.airhacks.domain.Address;
import com.airhacks.domain.Book;
import com.airhacks.domain.Customer;

@Stateless // it manages all transactions
public class EntityManagerSamples {
    
    @PersistenceUnit(unitName = "nameOfThePersistenceUnit")
    private EntityManager em;

    public void createBook(String isbn, String title) {
	Book book = new Book(title, isbn);
	em.persist(book);
    }

    public void createSampleCustomer1() {
	Address address = new Address("1", "2", "any");
	Customer customer = new Customer("john", address);
	em.persist(customer);
	em.persist(address);
    }

    public Book find(Long id) {
	return em.find(Book.class, id);
    }

    public void remove(Long id) {
	Book book = em.find(Book.class, id);
	if (book != null) {
	    em.remove(book);
	}
    }

    public Book findReferenceById(Long id) {
	try {
	    return em.getReference(Book.class, id);
	} catch (EntityNotFoundException e) {
	    return null;
	}
    }

    public void refreshingEntity() {
	Book book = em.find(Book.class, 1);
	book.setTitle("other title");
	em.refresh(book); // now title is again the one in the database
    }
    
    public void containsDetachAndMerge() {
	Book book = em.find(Book.class, 1);
	em.contains(book);// true
	em.detach(book);
	em.contains(book);// false
	em.merge(book);
	em.contains(book);// true
    }

}
