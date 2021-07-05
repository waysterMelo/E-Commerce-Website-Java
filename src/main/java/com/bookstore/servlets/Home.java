package com.bookstore.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.dao.CategoryDao;
import com.bookstore.entity.Category;


@WebServlet("")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public Home() {
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CategoryDao categoryDao = new CategoryDao();
		List<Category> name_category =  categoryDao.listAll();
		request.setAttribute("name_category", name_category); 
		
			String path = "frontend/index.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response); 
			
	}

}
