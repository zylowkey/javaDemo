package com.example.demo.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("DI"));
		ctx.close();
	}

}
