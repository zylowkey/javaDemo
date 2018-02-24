package com.example.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService annotationService = ctx.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = ctx.getBean(DemoMethodService.class);
		annotationService.add();
		demoMethodService.add();
		ctx.close();
		
	}

}
