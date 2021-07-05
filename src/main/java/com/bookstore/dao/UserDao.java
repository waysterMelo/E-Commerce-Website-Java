package com.bookstore.dao;

import com.bookstore.entity.Users;

public class UserDao extends JpaDao<Users> implements GenericDao<Users>{

	
	public UserDao( ) {
		
	}
	
	@Override
	public Users Create(Users e) {
		// TODO Auto-generated method stub
		return super.Create(e);
	}
	
	@Override
	public Users update(Users e) {
		// TODO Auto-generated method stub
		return super.update(e);
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
	public Users get(Object id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}
	
	
	
	
	
	
	
}
