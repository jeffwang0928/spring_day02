package com.jd.anno;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value="userService")
public class UserService {

/*	@Autowired
	private UserDao userDao;
	//使用注解方式时候不需要set方法
	*/
	
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	public void add(){
		System.out.println("Service.....");
		userDao.add();
	}
}
