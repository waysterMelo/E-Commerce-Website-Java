package com.bookstore.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDaoTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDao userDao;
	
	@BeforeClass
	public static void setupClass() {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		entityManager = entityManagerFactory.createEntityManager();
		
		userDao = new UserDao();
	}

	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setNome("Wayster");
		user1.setEmail("waystermelo@gmail.com");
		user1.setSenha("deus");
		
		UserDao dao = new UserDao();
		dao.Create(user1);		
		assertTrue(user1.getUserId() > 0);
	}
	
	
	
	@Test
	public void updateTest() {
		Users users = new Users();
		users.setUserId(1);
		users.setNome("Wayster H cruz de melo");
		users.setSenha("deus");
		users.setEmail("waystermelo@gmail.com");
		
		users = userDao.update(users);
		
		String expected = "Wayster H cruz de melo";
		String get = users.getNome();
		
		assertEquals(expected, get); 
		
		
	}
	
	
	
	@AfterClass
	public static void tearDownClass() {
		entityManager.close(); 
		entityManagerFactory.close();
	}

}
