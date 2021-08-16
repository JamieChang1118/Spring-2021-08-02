package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  相互依賴的物件要小心 toString(){}
 */


public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 第一組 (使用方法注入)
		Husband husband = (Husband)ctx.getBean("husband");
		System.out.println(husband);
		
		Wife wife = (Wife)ctx.getBean("wife");
		System.out.println(wife);
		
		System.out.printf("%s 的老婆是 %s\n" , husband.getName() , husband.getWife().getName());
		System.out.printf("%s 的老公是 %s\n" , wife.getName() , wife.getHusband().getName());
		
		
		// 第二組 (相互參照的物件可能無法使用建構子注入...)
		Husband husband2 = (Husband)ctx.getBean("husband2");
		System.out.println(husband2);
		
		Wife wife2 = (Wife)ctx.getBean("wife2");
		System.out.println(wife2);
		
		System.out.println(husband2.getName() + " 的老婆是 " + husband2.getWife().getName());
		System.out.println(wife2.getName() + " 的老公是 " + wife2.getHusband().getName());
	}

}
