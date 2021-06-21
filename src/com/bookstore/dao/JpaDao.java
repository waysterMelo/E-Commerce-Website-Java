package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class JpaDao<E> implements GenericDao<E>{
		
	protected EntityManager entityManager;
	
	public JpaDao(EntityManager entityManager) {
		// TODO Auto-generated constructor stub
		super();
		this.entityManager = entityManager;
	}

	@Override
	public E Create(E e) {
		entityManager.getTransaction().begin();
		entityManager.persist(e);
		entityManager.flush();
		entityManager.refresh(e);
		entityManager.getTransaction().commit();
		return e;
	}

	@Override
	public E update(E e) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
