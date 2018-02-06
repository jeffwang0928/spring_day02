package com.jd.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component(value="user")  //Ïàµ±ÓÚ<bean id="user" class="" />
@Scope(value="prototype")
public class User {
	
	public void add(){
		System.out.println("User add....");
	}
	
}
