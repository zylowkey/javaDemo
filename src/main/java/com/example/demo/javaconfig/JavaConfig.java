package com.example.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration //1 使用@Configuration注解表明当前类是一个配置类
public class JavaConfig {
	@Bean  //2 使用 @Bean注解声明当前方法 functionService的返回值是一个Bean，Bean的名称是方法名
	public FunctionService functionService(){
		return new FunctionService();
	}
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService service = new UseFunctionService();
		service.setFunctionService(functionService()); //3 注入FunctionService的Bean时候直接调用functionService()方法
		return service;
	}
	
/*	@Bean //4 另外一种注入方式，直接将FunctionService作为参数给useFunctionService。在Spring容器中，只要容器中存在某个Bean，就可以在另外一个Bean的声明方法的参数中写入
	public UseFunctionService useFunctionService(FunctionService functionService){
		UseFunctionService service = new UseFunctionService();
		service.setFunctionService(functionService);
		return service;
	}*/
}
