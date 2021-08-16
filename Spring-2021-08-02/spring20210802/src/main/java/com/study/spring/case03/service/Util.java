package com.study.spring.case03.service;


import java.util.Date;
import org.springframework.stereotype.Component;


@Component
public class Util {		// 只是一般的 Bean，但希望交由 Spring 管理
	public Util() {
		System.out.println("Util()");
	}
	
	public Date getToday() {		
		return new Date();
	}
}
