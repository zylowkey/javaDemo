/**
 * com.example.demo.scheduled
 */
package com.example.demo.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 1933
 * @date   2018年1月3日
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
				
	}

}
