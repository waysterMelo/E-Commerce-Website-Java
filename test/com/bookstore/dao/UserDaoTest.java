package com.bookstore.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

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
		
		userDao = new UserDao(entityManager);
	}

//	@Test
//	public void test_get_users() {
//		Integer id = 1;
//		Users users = userDao.get(id);
//		
//		assertNull(users); 
//		
//	}
	
//	@Test
//	public void delete_test() {
//		Integer id = 3;
//		userDao.delete(id); 
//		
//		Users users = userDao.get(id);
//		
//		assertNull(users); 
//		
//		
//	}
	
//	@Test
//	public void test_list_all() {
//		List<Users> list = userDao.listAll();
//		
//		for (Users user : list) {
//			System.out.println(user.getNome());
//		}
//		
//		assertTrue(list.size() > 0);
//	}

	
	@Test
	public void test_count() {
		long users = userDao.count();
		assertEquals(1, users); 
	}
	
	
//	@AfterClass
//	public static void tearDownClass() {
//		entityManager.close(); 
//		entityManagerFactory.close();
//	
//	}

}
