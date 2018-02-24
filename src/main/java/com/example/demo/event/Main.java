package com.example.demo.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublisher = ctx.getBean(DemoPublisher.class);
		demoPublisher.publisher("hello application event");
		ctx.close();
	}

}
