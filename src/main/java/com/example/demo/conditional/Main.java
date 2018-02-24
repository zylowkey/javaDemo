/**
 * com.example.demo.conditional
 */
package com.example.demo.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 1933
 * @date 2018年1月3日
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService service = ctx.getBean(ListService.class);
		System.out.println(ctx.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+service.showListCmd());
		service.showListCmd();
		ctx.close();
	}

}
