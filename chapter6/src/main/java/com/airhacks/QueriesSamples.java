package com.airhacks;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import com.airhacks.domain.Book;
import com.airhacks.domain.Customer;

@Stateless
public class QueriesSamples {
    
    @PersistenceUnit(unitName = "puName")
    private EntityManager em;
    
    public void samples() {
	TypedQuery<Customer> query1 = em.createQuery("SELECT c FROM Customer c", Customer.class);
	List<Customer> customers = query1.getResultList();
	System.out.println(customers);
	
	TypedQuery<Book> query2 = em.createQuery("SELECT b FROM Book b WHERE title = :title", Book.class);
	query2.setParameter("title", "Ender's Game");
	Book book = query2.getSingleResult();
	System.out.println(book);
	
	TypedQuery<Customer> query3 = em.createNamedQuery(Customer.FIND_ALL_QUERY, Customer.class);
	customers = query3.getResultList();
	System.out.println(customers);
    }

}
