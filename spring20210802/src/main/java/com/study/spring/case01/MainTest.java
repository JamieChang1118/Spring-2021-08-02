package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// IoC 反轉控制
		// Author author = ctx.getBean(Author.class);
		
		Author author1 = (Author)ctx.getBean("author1");
		System.out.println(author1);
		
		Author author2 = (Author)ctx.getBean("author2");
		System.out.println(author2);
		
		Author author3 = (Author)ctx.getBean("author3");
		System.out.println(author3);
		
		Author author4 = (Author)ctx.getBean("author4");
		System.out.println(author4);
		
		// Spring DI (依賴注入): author1用方法注入，author2用建構子注入，author3用p: 注入，author4用c: 注入
		
		
	}

}
