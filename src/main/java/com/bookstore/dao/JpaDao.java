package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bookstore.entity.Category;

public class JpaDao<E> implements GenericDao<E>{
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
	}
	
	public JpaDao() {
		
	}

	@Override
	public E Create(E e) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.flush();
		entityManager.refresh(e);
		entityManager.getTransaction().commit();
		return e;
	}

	@Override
	public E update(E e) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(e);
		entityManager.getTransaction().commit();
		return e;
	}

	@Override
	public E get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<E> listAll() {
		
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<E> findWithNamedQuery(String queryName){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createNamedQuery(queryName);
		
		@SuppressWarnings("unchecked")
		List<E> list = query.getResultList();
		entityManager.close();
		return list;
				
	}
	
	
}
