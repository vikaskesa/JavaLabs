package com.cg.hibernate.Labs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AuthorDemo {

	public static void main(String[] args) {
		Author author=new Author();
		author.setAuthorId(100);
		author.setFirstName("Teja");
		author.setMiddleName("sai");
		author.setLastName("Kesa");
		author.setPhoneNumber("54321");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(author);
		txn.commit();
		System.out.println("Account saved :)");
		
		Author auth=new Author();
		auth.setAuthorId(300);
		auth.setFirstName("Srinu");
		auth.setLastName("K");
		auth.setMiddleName("sai");
		auth.setPhoneNumber("9876543221");
		em.merge(auth);
		
		txn.commit();
		System.out.println("Account updated :)");
		
		int authorId=300;
		Author a=em.find(Author.class, authorId);
		if(a!=null) {
			EntityTransaction txn1=em.getTransaction();
			txn1.begin();
			
			em.remove(a);
			txn1.commit();
			System.out.println("Account deleted:)");
			
		}
		else {
			System.out.println("Account not found with authorId"+authorId);
		}
		em.close();
		emf.close();

	}

}
