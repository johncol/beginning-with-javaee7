package com.airhacks;

public class JPQLSampleQueries {
    
    public void samples() {
	System.out.println("SELECT b FROM Book b");
	System.out.println("SELECT b.title FROM Book b");
	System.out.println("SELECT b FROM Book b WHERE b.title = 'enders game'");
	System.out.println("SELECT c.address.country.code FROM Customer c");
	System.out.println("SELECT NEW com.airhacks.dots.CustomerDTO(c.name, c.lastname) FROM Customer c");
	System.out.println("SELECT DISTINCT b.author FROM Book b ORDER BY b.author ASC");
	System.out.println("SELECT COUNT(b) FROM Book b");
	System.out.println("SELECT c FROM Customer c WHERE c.age NOT BETWEEN 18 AND 24");
	System.out.println("SELECT c FROM Customer c WHERE c.email LIKE '%gmail.com'");
	
	System.out.println("SELECT c FROM Cusotmer c WHERE c.name = ?1 AND c.lastname = ?2");
	System.out.println("SELECT c FROM Cusotmer c WHERE c.name = :name AND c.lastname = :lastname");
	
	System.out.println("SELECT c FROM Customer c WHERE c.age = (SELECT MIN(cust.age) FROM Customer cust)");
	
	System.out.println("SELECT c.age, COUNT(c) FROM Customer c GROUP BY c.age HAVING c.age > 18");
	System.out.println("SELECT c.address.country, COUNT(c) FROM Customer c GROUP BY c.address.country");
	
	
	System.out.println("DELETE FROM Customer c WHERE c.age < 10");
	System.out.println("UPDATE Customer c SET c.name = 'Too young to be registered' WHERE c.age < 10");
    }

}
