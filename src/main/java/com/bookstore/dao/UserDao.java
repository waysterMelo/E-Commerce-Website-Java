package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Users;

public class UserDao extends JpaDao<Users> implements GenericDao<Users>{

	
	public UserDao(EntityManager entityManager) {
		super(entityManager);
	}
	
	@Override
	public Users Create(Users e) {
		return super.Create(e);
	}
	
	@Override
	public Users update(Users e) {
		return super.update(e);
	}
	
	@Override
	public void delete(Object id) {
		super.delete(Users.class, id); 
		
	}
	
	@Override
	public long count() {
		return super.count_with_named_query("Users.count");
	} 
	 
	@Override
	public Users get(Object id) {
		return super.get(id);
	}
	
	@Override
	public List<Users> listAll() {
		
		return super.findWithNamedQuery("Users.listAll");
	}
	
	
	
	
	
}
