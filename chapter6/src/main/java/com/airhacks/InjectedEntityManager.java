package com.airhacks;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import com.airhacks.domain.Book;

@Stateless // it manages all transactions
public class InjectedEntityManager {

    @PersistenceUnit(unitName = "nameOfThePersistenceUnit")
    private EntityManager em;

    public Book createBook(String isbn, String title) {
	Book book = new Book(title, isbn);
	em.persist(book);
	return book;
    }

}
