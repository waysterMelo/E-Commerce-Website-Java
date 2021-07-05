package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Category;

public class CategoryDao extends JpaDao<Category> implements GenericDao<Category>{
	
	
	public CategoryDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Category Create(Category e) {
		// TODO Auto-generated method stub
		return super.Create(e);
	}
	
	@Override
	public Category update(Category e) {
		// TODO Auto-generated method stub
		return super.update(e);
	}
	
	@Override
	public List<Category> listAll() {
		return super.findWithNamedQuery("Category.listAll");
	}
	
	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}
	
	@Override
	public Category get(Object id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return super.count();
	}
	
	

}
