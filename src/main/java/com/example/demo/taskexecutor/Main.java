/**
 * com.example.demo.taskexecutor
 */
package com.example.demo.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 1933
 * @date   2017年11月22日
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//使用 AnnotationConfigApplicationContext 作为Spring 容器，接收一个配置类作为参数
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService service = ctx.getBean(AsyncTaskService.class);
		for (int i = 0; i < 10; i++) {
			service.executeAsyncTask(i);
			service.executeAsyncTaskPlus(i);
		}
		ctx.close();
	}

}
