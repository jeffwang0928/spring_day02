package com.jd.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	@Test
	public void TestAop(){
			
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
		Book b = (Book) ac.getBean("book");
		b.add();
	}
}
