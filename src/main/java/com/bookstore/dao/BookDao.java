package com.bookstore.dao;

import com.bookstore.entity.Book;

public class BookDao extends JpaDao<Book> implements GenericDao<Book>{

	public BookDao() {
		super();
	}
	
	@Override
	public Book Create(Book e) {
		return super.Create(e);
	}
	
	@Override
	public Book update(Book e) {
		return super.update(e);
	}
	
	@Override
	public void delete(Object id) {
		
		super.delete(id);
	}
	
	@Override
	public long count() {
		
		return super.count();
	}
	
	@Override
	public Book get(Object id) {
		return super.get(id);
	}

	

}
