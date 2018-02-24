package com.example.demo.Value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		//使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ELConfig.class);
		ELConfig config = ctx.getBean(ELConfig.class);
		config.outputResource();
		ctx.close();
	}

}
