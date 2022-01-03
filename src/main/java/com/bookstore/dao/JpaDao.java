package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bookstore.entity.Category;

public class JpaDao<E> {
	
	protected EntityManager entityManager;
	
	public JpaDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	public E Create(E e) {
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.flush();
		entityManager.refresh(e);
		entityManager.getTransaction().commit();
		return e;
	}

	public E update(E e) {
		entityManager.getTransaction().begin();
		entityManager.merge(e);
		entityManager.getTransaction().commit();
		return e;
	}

	
	public E get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void delete(Class<E> type, Object id) {
		entityManager.getTransaction().begin();
		Object reference = entityManager.getReference(type, id);
		entityManager.remove(reference);
		entityManager.getTransaction().commit();
		
	}

	
	public List<E> listAll() {
		return null;
	}

	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<E> findWithNamedQuery(String queryName){
		Query query = entityManager.createNamedQuery(queryName);
		
		@SuppressWarnings("unchecked")
		List<E> list = query.getResultList();
		entityManager.close();
		return list;
				
	}
	
	public E find(Class<E> type, Object Id) {
		E entity = entityManager.find(type, Id);
		if (entity != null) {
			entityManager.refresh(entity); 
		}
		return entity;
	}
	
	public long count_with_named_query(String queryName) {
		Query query = entityManager.createNamedQuery(queryName);
		return (long) query.getSingleResult();
	}
}
