package com.qxy.bookshop.service.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qxy.bookshop.dao.UserDao;
import com.qxy.bookshop.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springApplicationContext.xml"})
public class UserServiceTest {
	
	//private static ApplicationContext applicationContext = null;   //提供静态ApplicationContext  
	  
	@Autowired
	private UserDao userDao;
	
	/*static{  
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //实例化  
    } */ 
	
	@Test
	public void testUser(){
		testInsertPerson();
		/*testQueryAllPerson();
		testDeletePerson();
		testQueryAllPerson();*/
	}
	
    //添加操作  
    public void testInsertPerson(){  
    	User user = new User();
    	user.setId("1");
    	user.setUsername("root");
    	user.setPassword("123");;
    	userDao.insertUser(user);  
    }  
      
    //删除操作  
    public void testDeletePerson(){  
    	userDao.deleteById("1");  
    }  
      
    //查询全部  
    public void testQueryAllPerson(){  
        List<User> users = userDao.queryAllUser();  
        //System.out.println(persons.size());  
        Iterator<User> ite = users.iterator();  
        while(ite.hasNext()){  
        	User user = ite.next();  
            System.out.print("ID: "+user.getId());  
            System.out.print(" userName: "+user.getUsername());  
            System.out.print(" password: "+user.getPassword());  
            System.out.println();  
        }  
    }  
}
