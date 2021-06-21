package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Users;

public class User_dao extends JpaDao<Users> implements GenericDao<Users>{

	public User_dao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Users Create(Users users) {
		// TODO Auto-generated method stub
		return super.Create(users);
	}
	
	@Override
	public Users update(Users user) {
		// TODO Auto-generated method stub
		return super.update(user);
	}
	
	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return super.count();
	}
	
	@Override
	public List<Users> listAll() {
		// TODO Auto-generated method stub
		return super.listAll();
	}
	

}
