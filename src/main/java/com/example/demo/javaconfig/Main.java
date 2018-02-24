package com.example.demo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demo class
 * 
 * @author 1933
 * @date 2017/11/22
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("java config"));
		ctx.close();
	}

}
