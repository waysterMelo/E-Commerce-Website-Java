package com.bookstore.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.dao.BookDao;
import com.bookstore.dao.CategoryDao;

public class HomeServices extends HttpServlet{
	
	
	private static final long serialVersionUID = 132131321;
	private HttpServletRequest request;
	private HttpServletResponse response;
	BookDao bookdao ;
	CategoryDao categoryDao;
	
	public HomeServices(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		bookdao = new BookDao();
		categoryDao = new CategoryDao();
	}
	

	

}
