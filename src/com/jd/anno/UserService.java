package com.jd.anno;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value="userService")
public class UserService {

/*	@Autowired
	private UserDao userDao;
	//ʹ��ע�ⷽʽʱ����Ҫset����
	*/
	
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	public void add(){
		System.out.println("Service.....");
		userDao.add();
	}
}
